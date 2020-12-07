package com.kharitonov.hibernate.dao;

import com.kharitonov.hibernate.entity.City;
import com.kharitonov.hibernate.entity.Country;

import java.util.List;

public interface CountryDao extends BaseDao<Country, String> {
    List<City> findCities(String code);
}
