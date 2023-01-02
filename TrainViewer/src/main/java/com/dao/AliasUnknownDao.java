package com.dao;

import com.beans.AliasUnknown;

public interface AliasUnknownDao {
	
	public void create(AliasUnknown au);
	public AliasUnknown get(String unknown);
}
