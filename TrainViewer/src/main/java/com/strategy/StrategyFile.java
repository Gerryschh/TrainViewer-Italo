package com.strategy;

import java.io.File;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.beans.Alias;
import com.beans.Country;
import com.beans.Factory;
import com.beans.Train;
import com.beans.User;

public class StrategyFile implements Strategy {
	
	private static Set<String> standards;

	@Override
	public String getAliasCountry(String alias) {
		// TODO Auto-generated method stub
		return null;
	}
	//NON HO UN DB
	@Override
	public Map<String, List<String>> dataMap() {
        HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		try {
			Scanner sc= new Scanner (new File("./src/main/resources/dataset/data_csv.txt.csv"));
			sc.useDelimiter("\n");
			while(sc.hasNext()) {
				//System.out.println(sc.next());
				String current= sc.next();
				if (current.contains("\"")) {
					String[] dati=current.trim().replaceAll("\"", "").split(",");
					List<String> x= new ArrayList<String>();
					x.add(dati[2]);
					String concatenata= dati[1].concat(" ").concat(dati[0]);
					x.add(concatenata);
					map.put(dati[0], x);
				}
				else {
					String[] dati=current.trim().split(","); 
					//dati[0] contiene il country, dati[1] contiene l'alias
					List<String> x= new ArrayList<String>();
					x.add(dati[1]);
					map.put(dati[0], x);
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setStandards(map.keySet());
		return map;
	}

	@Override
	public void addAliasUnknown(String input) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String toString() {
		String result = "";
		for(String paese: this.dataMap().keySet()) {
			result += "Paese: "+paese+
					"      Aliases: "+this.dataMap().get(paese).toString()+
					"\n";
		}
		return result;
	}
	public Set<String> getCountryNames() {
		return standards;
	}
	public static void setStandards(Set<String> standards) {
		StrategyFile.standards = standards;
	}
	@Override
	public Collection<Country> getAllCountries() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<Alias> getUnapprovedAliases() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void approveAlias(String[] list) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addUser(String user_mail, String password, String user_name) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User getUserByMail(String userMail) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Collection<Train> getAllTrains() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Collection<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public User checkUser(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Factory> getFactory() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Train> getTrainsWithParameter(int factory, String departure, String arrival) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addTrain(String matTrain, String departure, String arrival, Date hour, int factory) {
		// TODO Auto-generated method stub
		
	}
}
