package com.models.dao;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Muhammad.Nizar01 on 8/10/2017.
 */

@SuppressWarnings("unchecked")
@Transactional
public class BaseDAO extends HibernateDaoSupport {
    public Session getCurrentSession() {
        return getHibernateTemplate().getSessionFactory().getCurrentSession();
    }

    public <T> T save(final T o) {
        return (T) getCurrentSession().save(o);
    }

    public <T> void saveOrUpdate(final T o) {
        getCurrentSession().saveOrUpdate(o);
    }

    public <T> List<T> getAll(final Class<T> type) {
        final Session session = getCurrentSession();
        final Criteria crit = session.createCriteria(type);
        return crit.list();
    }
}
