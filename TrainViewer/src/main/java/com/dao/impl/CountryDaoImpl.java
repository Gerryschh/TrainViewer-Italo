package com.dao.impl;

import com.dao.CountryDao;
import com.beans.Country;

public class CountryDaoImpl extends BaseDao implements CountryDao {
	public void create(Country c) {
		super.create(c);
	}

	@Override
	public Country get(String countryName) {
		return (Country) super.get(Country.class, countryName);
	}
}
