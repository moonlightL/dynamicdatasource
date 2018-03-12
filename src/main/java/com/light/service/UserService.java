package com.light.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.light.domain.User;
import com.light.mapper.UserMapper;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	public User getUser(int id) {
		return this.userMapper.getById(id);
	}
	
	public void delete(int id) {
		this.userMapper.deleteById(id);
	}
}
