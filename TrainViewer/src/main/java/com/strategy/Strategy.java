package com.strategy;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.beans.Alias;
import com.beans.Country;
import com.beans.Factory;
import com.beans.Train;
import com.beans.User;

public interface Strategy {
	
	//Metodi ADD
	public void addAliasUnknown(String input);
	public void addUser(String userMail, String password, String userName);
	public void addTrain(String matTrain, String departure, String arrival);
	
	//Metodi GET
	public Set<String> getCountryNames();
	public Collection<Country> getAllCountries();
	public Collection<Alias> getUnapprovedAliases();
	public String getAliasCountry(String alias);
	public Map<String,List<String>> dataMap();
	public User getUserByMail(String userMail);
	public Collection<Train> getAllTrains();
	public Collection<User> getAllUsers();
	public User checkUser(String email, String password);
	public List<Factory> getFactory();
	
	//Metodi SET
	public void approveAlias(String[] list);
}
