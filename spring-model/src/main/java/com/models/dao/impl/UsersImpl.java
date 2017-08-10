package com.models.dao.impl;

import com.models.dao.BaseDAO;
import com.models.dao.UsersDao;
import com.models.model.Users;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import java.util.List;
public class UsersImpl extends BaseDAO implements UsersDao {

//    @Autowired
//    SessionFactory session;
//
//    public boolean saveOrUpdate(Users users) {
//        session.getCurrentSession().saveOrUpdate(users);
//        return true;
//    }
//
//    public List<Users> list() {
//        return session.getCurrentSession().createQuery("from Users").list();
//    }
//
//    public boolean delete(Users users) {
//        try {
//            session.getCurrentSession().delete(users);
//        } catch (Exception ex) {
//            return false;
//        }
//
//        return true;
//    }

    public boolean saveOrUpdate(Users users) {
        return false;
    }

    public List<Users> list() {
        return null;
    }

    public boolean delete(Users users) {
        return false;
    }

    public Users getUserByUsername(String username) {
        Criteria criteria = getCurrentSession().createCriteria(Users.class);
        criteria.add(Restrictions.eq("user_name",username));
        return (Users) criteria.uniqueResult();
    }
}
