package com.models.dao.impl;

import com.models.dao.UsersDao;
import com.models.model.Users;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository
@Transactional
public class UsersImpl implements UsersDao {

	@Autowired
	SessionFactory session;
	
	public boolean saveOrUpdate(Users users) {
		// TODO Auto-generated method stub
		session.getCurrentSession().saveOrUpdate(users);
		return true;
	}

	@SuppressWarnings("unchecked")
	public List<Users> list() {
		return session.getCurrentSession().createQuery("from Users").list();
	}

	public boolean delete(Users users) {
		try{
			session.getCurrentSession().delete(users);
		}catch(Exception ex){
			return false;
		}
		
		return true;
	}
	
	
}