package com.hcl.service;

import com.hcl.entity.User;

public interface ServiceInterface {
	public User getUser(int id);
	public User updateUser(User user);
}
