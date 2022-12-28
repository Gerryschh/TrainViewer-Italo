package com.beans;

public class Alias implements Bean {
	private String alias;
	private Country country;
	private boolean approved;
	private String algorithm;

	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

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
