package com.light.mapper;

import com.light.domain.User;

public interface UserMapper {

	public User getById(int id);
	
	public void deleteById(int id);
	
}
