package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simplilearn.entity.User;

@Repository
public class UserDAOImpl implements UserDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional 
	public List<User> getUsers() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<User> theQuery = currentSession.createQuery("from User", User.class);

		// execute query and get result list
		List<User> users = theQuery.getResultList();
		 

		// return the results
		return users;
	}

	@Override
	@Transactional 
	public User getUser(int userId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		User user = currentSession.get(User.class, userId);

		return user;
	}

	@Override
	@Transactional 
	public void saveUser(User user) {

		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/update the customer
		currentSession.saveOrUpdate(user);

	}

	@Override
	@Transactional 
	public void deleteUser(int userId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete object with primary key
		Query theQuery = 
				currentSession.createQuery("delete from User where id=:userId");
		theQuery.setParameter("userId", userId);
		
		theQuery.executeUpdate();		

	}

}
