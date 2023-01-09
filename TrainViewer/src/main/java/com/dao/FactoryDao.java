package com.dao;

import com.beans.Factory;
import com.beans.Train;

public interface FactoryDao { 
	
	
	public void create(Factory t);
	public Train getId(String idFactory);
	public Train getName(String nameFactory);
}