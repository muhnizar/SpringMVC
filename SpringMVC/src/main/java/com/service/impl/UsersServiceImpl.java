package com.service.impl;

import com.models.dao.UsersDao;
import com.models.model.Users;
import com.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServiceImpl implements UsersService{

	@Autowired
	UsersDao userDao;
	
	public boolean saveOrUpdate(Users users) {
		return userDao.saveOrUpdate(users);
	}

	public List<Users> list() {
		return userDao.list();
	}

	public boolean delete(Users users) {
		return userDao.delete(users);
	}

	public Users getUserByUserName(String username) {
		return userDao.getUserByUsername(username);
	}

}
