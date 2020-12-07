package com.kharitonov.hibernate.dao.impl;

import com.kharitonov.hibernate.dao.CityDao;
import com.kharitonov.hibernate.entity.City;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("cityDao")
public class HibernateCityDao implements CityDao {

    private static final Log LOG = LogFactory.getLog(HibernateCityDao.class);
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional(readOnly = true)
    public City findById(Integer id) {
        return (City) sessionFactory.getCurrentSession().byId(City.class).load(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<City> findAll() {
        return sessionFactory.getCurrentSession().createQuery("from City c").list();//HQL
    }

    @Override
    public void insert(City entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void update(City entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(Integer id) {
        sessionFactory.getCurrentSession().delete(new City(id));
    }
}
