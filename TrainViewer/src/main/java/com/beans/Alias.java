package com.beans;

public class Alias implements Bean {
	private String alias;
	private Country country;
	private boolean approved;

	public boolean isApproved() {
		return approved;
	}
	
	public void setApproved(boolean approved) {
		this.approved = approved;
	}
	
	public String getAlias() {
		return alias;
	}
	
	public void setAlias(String aliasCountry) {
		this.alias = aliasCountry;
	}
	
	public Country getCountry() {
		return country;
	}
	
	public void setCountry(Country country) {
		this.country = country;
	}
}
