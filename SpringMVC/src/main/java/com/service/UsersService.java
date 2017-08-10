package com.service;

import com.models.model.Users;

import java.util.List;

public interface UsersService {
	public boolean saveOrUpdate(Users users);
	public List<Users> list();
	public boolean delete(Users users);
}
