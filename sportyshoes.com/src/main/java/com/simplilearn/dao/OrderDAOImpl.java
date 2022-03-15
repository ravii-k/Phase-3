package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simplilearn.entity.Order;
import com.simplilearn.entity.User;

@Repository
public class OrderDAOImpl implements OrderDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Order> getOrder() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Order> theQuery = currentSession.createQuery("from Order", Order.class);

		// execute query and get result list
		List<Order> orders = theQuery.getResultList();

		// return the results
		return orders;
	}

	@Override
	@Transactional
	public void saveOrder(Order order) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/update the customer
		currentSession.saveOrUpdate(order);
	}

	@Override
	@Transactional
	public Order getOrder(int orderId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Order order = currentSession.get(Order.class, orderId);

		return order;
	}

	@Override
	@Transactional
	public void deleteOrder(int orderId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Order where id=:orderId");
		theQuery.setParameter("orderId", orderId);

		theQuery.executeUpdate();

	}

	@Override
	@Transactional
	public List<Order> getUserOrders(int userId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query ... sort by last name
		Query<Order> theQuery = currentSession.createQuery("from Order where user_id =: userId", Order.class);
		theQuery.setParameter("userId", userId);
		// execute query and get result list
		List<Order> orders = theQuery.getResultList();

		// return the results
		return orders;
	}

}
