package com.simplilearn.dao;

import java.util.List;

import com.simplilearn.entity.Order;
import com.simplilearn.entity.Product;

 

public interface ProductDAO {
	public List<Product> getProducts();
	
	public Product getProduct(int productId);
	
	public void saveProduct(Product product);
	
	public void deleteProduct(int productId);
	
	
	public List<Product> searchProducts(String key);
	
}
