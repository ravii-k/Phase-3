package com.hcl.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hcl.entity.User;

@Repository
public interface UserDaoInterface extends CrudRepository<User, Integer>{

}
