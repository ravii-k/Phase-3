package com.simplilearn.dao;

import java.util.List;

import com.simplilearn.entity.Order;
import com.simplilearn.entity.Product;
import com.simplilearn.entity.User;

public interface OrderDAO {
	
	public List<Order> getOrder();
	
	public Order getOrder(int orderId);
	
	public void saveOrder(Order order);
	
	public void deleteOrder(int orderId);
	
	
	public List<Order> getUserOrders(int userId);

}
