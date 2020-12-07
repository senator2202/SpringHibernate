package com.kharitonov.hibernate.dao.impl;

import com.kharitonov.hibernate.dao.CountryDao;
import com.kharitonov.hibernate.entity.City;
import com.kharitonov.hibernate.entity.Country;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Repository("countryDao")
public class HibernateCountryDao implements CountryDao {

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
    public Country findById(String id) {
        return (Country) sessionFactory.getCurrentSession().byId(Country.class).load(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Country> findAll() {
        return sessionFactory.getCurrentSession().createQuery("FROM Country c").list();//HQL
    }

    @Override
    public void insert(Country entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void update(Country entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(String id) {
        sessionFactory.getCurrentSession().delete(new Country(id));
    }

    @Override
    public List<City> findCities(String code) {
        return sessionFactory.getCurrentSession()
                .createQuery("FROM City c WHERE c.country.code=:code").setString("code", code).list();
    }
}
