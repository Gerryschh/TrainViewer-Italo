package com.dao;

import com.beans.Country;

public interface CountryDao {
	public void create(Country c);
	public Country get(String countryName);
}
