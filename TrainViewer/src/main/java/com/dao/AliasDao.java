package com.dao;

import com.beans.Alias;

public interface AliasDao {
	
	public void create(Alias a);
	public Alias get(String aliasCountry);
}
