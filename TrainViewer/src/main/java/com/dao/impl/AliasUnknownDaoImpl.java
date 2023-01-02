package com.dao.impl;

import com.dao.AliasUnknownDao;
import com.beans.AliasUnknown;

public class AliasUnknownDaoImpl extends BaseDao implements AliasUnknownDao {
	
	public void create(AliasUnknown au) {
		super.create(au);
	}
	
	@Override
	public AliasUnknown get(String unknown) {
		return (AliasUnknown) super.get(AliasUnknown.class, unknown);
	}
}
