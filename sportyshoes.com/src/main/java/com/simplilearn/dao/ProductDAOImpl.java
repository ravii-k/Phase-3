package com.simplilearn.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.simplilearn.entity.Order;
import com.simplilearn.entity.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<Product> getProducts() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Product> theQuery = currentSession.createQuery("from Product", Product.class);

		// execute query and get result list
		List<Product> products = theQuery.getResultList();

		// return the results
		return products;
	}

	@Override
	@Transactional
	public Product getProduct(int productId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// now retrieve/read from database using the primary key
		Product prod = currentSession.get(Product.class, productId);

		return prod;
	}

	@Override
	@Transactional
	public void saveProduct(Product product) {
		// get current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/update
		currentSession.saveOrUpdate(product);

	}

	@Override
	@Transactional
	public void deleteProduct(int productId) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();

				// delete object with primary key
				Query theQuery = currentSession.createQuery("delete from Product where id=:productId");
				theQuery.setParameter("productId", productId);

				theQuery.executeUpdate();

	}

	@Override
	@Transactional
	public List<Product> searchProducts(String key) {
		// get the current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();

				// create a query
				Query<Product> theQuery = currentSession.createQuery("from Product where name like: key", Product.class);
				theQuery.setParameter("key", "%" + key + "%");
				// execute query and get result list
				List<Product> products = theQuery.getResultList();
				
				System.out.println();
				// return the results
				return products;
	}

}
