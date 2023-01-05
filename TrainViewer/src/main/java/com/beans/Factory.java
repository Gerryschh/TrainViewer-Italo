package com.beans;

public class Factory implements Bean {
	private int idFactory;
	private String nameFactory;
	
	public int getIdFactory() {
		return idFactory;
	}
	
	public void setIdFactory(int idFactory) {
		this.idFactory = idFactory;
	}
	
	public String getNameFactory() {
		return nameFactory;
	}
	
	public void setNameFactory(String nameFactory) {
		this.nameFactory = nameFactory;
	}
	
}
