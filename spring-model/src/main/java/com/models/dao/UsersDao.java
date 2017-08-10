package com.models.dao;


import com.models.model.Users;
import java.util.List;


public interface UsersDao {
	public boolean saveOrUpdate(Users users);
	public List<Users> list();
	public boolean delete(Users users);
}
