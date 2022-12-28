package com.dao.impl;

import com.dao.AliasDao;
import com.beans.Alias;
import com.beans.Country;

public class AliasDaoImpl extends BaseDao implements AliasDao {
	
	public void create(Alias a) {
		super.create(a);
	}

	@Override
	public Alias get(String aliasCountry) {
		return (Alias) super.get(Alias.class, aliasCountry);
	}
	
}
