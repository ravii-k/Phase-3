package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.UserDaoInterface;
import com.hcl.entity.User;


@Service
@Transactional
public class ServiceImpl implements ServiceInterface{
	
	
	@Autowired
	private UserDaoInterface dao;
	@Override
	public User getUser(int id) {
		return dao.findById(id).get();
	}
	@Override
	public User updateUser(User user) {
		return dao.save(user);
	}
	
	

}
