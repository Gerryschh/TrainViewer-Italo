package com.strategy;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import com.beans.Alias;
import com.beans.AliasUnknown;
import com.beans.Country;
import com.beans.Factory;
import com.beans.Train;
import com.beans.User;
import com.connectionDB.ConnectionToDB;
import com.dao.AliasUnknownDao;
import com.dao.impl.AliasDaoImpl;
import com.dao.impl.AliasUnknownDaoImpl;
import com.dao.impl.TrainDaoImpl;
import com.dao.impl.UserDaoImpl;

public class StrategyDB implements Strategy{
	//WIP serve l'RMI
	static Session session = ConnectionToDB.getSession();
	private AliasUnknownDao unknownDao = new AliasUnknownDaoImpl();
	private AliasDaoImpl aliasDao = new AliasDaoImpl();
	private UserDaoImpl userDao = new UserDaoImpl();
	private TrainDaoImpl trainDao = new TrainDaoImpl();
	private Map<String,List<String>> dataMap;
	public String getAliasCountry(String input) {
		String query = "select nome_paese from alias where alias_paese = " + input;
		NativeQuery<String> q = session.createSQLQuery(query);
		return q.getSingleResult();
	}	

	/*
	 * METODI ADD
	 */

	@Override
	public void addAliasUnknown(String input) {
		AliasUnknown au = new AliasUnknown();
		au.setUnknown(input);
		unknownDao.create(au);
	}


	@Override
	public void addUser(String userMail, String password, String userName) {
		User u = new User();
		u.setUserMail(userMail);
		u.setPassword(password);
		u.setUserName(userName);
		u.setAdmin(false);
		userDao.create(u);
	}

	@Override
	public void addTrain(String matTrain, String departure, String arrival,  Date hour, int factory) {
		Train t = new Train();
		t.setMatTrain(matTrain);
		t.setDeparture(departure);
		t.setArrival(arrival);
		t.setHour(hour);
		t.setFactory(factory);
		trainDao.create(t);
	}	


	/*
	 * METODI GET
	 */

	public Map<String,List<String>> dataMap() {
		NativeQuery<String> q = session.createSQLQuery("Select country_name From country");
		HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s: q.getResultList()) {
			map.put(s.toLowerCase(), new ArrayList<String>());
		}
		NativeQuery<Object []> mq = session.createSQLQuery("Select alias_country, country_name from alias");
		List<Object[]>  l =mq.list();
		System.out.println(l.size());
		for(Object[] o: l) { 
			List<String> temp = map.get(((String)o[1]).toLowerCase());
			temp.add((String) o[0]);
			map.put((String) o[1], temp);            
		}
		dataMap=map;
		return map;
	}


	@Override
	public Set<String> getCountryNames() {
		return dataMap.keySet();
	}


	@Override
	public Collection<Country> getAllCountries() {

		Collection<Country> cc = new LinkedList <Country>();
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from country");
		List<Object[]> countries = mq.list();

		for (Object[] o: countries) {
			Country c = new Country();
			c.setCountryName((String) o[0]);
			c.setAlpha2code((String) o[1]);
			cc.add(c);
		}
		return cc;
	}

	@Override
	public Collection<Alias> getUnapprovedAliases() {
		Collection<Alias> ca = new LinkedList <Alias>();
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from alias where approved = 0");
		List<Object[]> aliases = mq.list();

		for (Object[] o: aliases) {
			Alias a = new Alias();
			a.setAlias((String) o[0]);
			a.setAlgorithm((String) o[3]);
			a.setApproved(false);
			Country c = new Country();
			c.setCountryName((String) o[1]);
			a.setCountry(c);
			ca.add(a);
		}
		return ca;
	}

	@Override
	public User getUserByMail(String userMail) {
		User u = userDao.get(userMail);
		return u;
	}

	@Override
	public Collection<Train> getAllTrains() {
		Collection<Train> ct = new LinkedList <Train>();
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from train");
		List<Object[]> trains = mq.list();

		for (Object[] o: trains) {
			Train t = new Train();
			t.setIdTrain((Integer) o[0]);
			t.setMatTrain((String) o[1]);
			t.setDeparture((String) o[2]);
			t.setArrival((String) o[3]);
			t.setHour((Date) o[4]);
			t.setFactory((Integer) o[5]);
			ct.add(t);
		}
		return ct;
	}

	@Override
	public Collection<User> getAllUsers() {
		Collection<User> cu = new LinkedList <User>();
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from userr where is_admin = 0");
		List<Object[]> users = mq.list();

		for (Object[] o: users) {
			User u = new User();
			u.setUserMail((String) o[0]);
			u.setPassword((String) o[1]);
			u.setUserName((String) o[2]);
			u.setAdmin(false);
			cu.add(u);
		}
		return cu;
	}

	@Override
	public User checkUser(String email, String password) {
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from userr where user_mail ='" + email + "' and user_password = '" +  password + "'");

		List<Object[]> users = mq.list();
		if(users.size() > 0) {
			for (Object[] o: users) {
				User u = new User();
				u.setUserMail((String) o[0]);
				u.setPassword((String) o[1]);
				u.setUserName((String) o[2]);
				u.setAdmin((boolean) o[3]);

				return u;
			}
		}
		return null;
	}
	
	public List<Factory> getFactory(){
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from train_factory");
		List<Object[]> factory = mq.list();
		List<Factory> factoryList = new ArrayList<>();
		if (!factory.isEmpty()) {
			for (Object[] o: factory) {
				Factory f = new Factory();
				f.setIdFactory((int) o[0]);
				f.setNameFactory((String) o[1]);
			factoryList.add(f);
			}
		} 
		
		return factoryList;
		
	}

	@Override
	public Collection<Train> getTrainsWithParameter(int factory, String departure, String arrival) {
		Collection<Train> ct = new HashSet <Train>();
		NativeQuery<Object []> mq = session.createSQLQuery("Select * from train where factory = " + factory 
				+ " AND departure = '" + departure + "' AND arrival = '"+ arrival + "'");
		List<Object[]> trains = mq.list();
		System.out.println("LISTA DAL DB DEI TRENI: " + ct);
		for (Object[] o: trains) {
			Train t = new Train();
			t.setIdTrain((Integer) o[0]);
			t.setMatTrain((String) o[1]);
			t.setFactory((int) o[2]);
			t.setDeparture((String) o[3]);
			t.setArrival((String) o[4]);
			t.setHour((Date) o[5]);
			ct.add(t);
			System.out.println("LISTA DAL DB DEI TRENI: " + ct);
		}
		return ct;
		
		/*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
			Date dateTime = DateTime.parse(dateInString, formatter);*/
	}

	/*
	 * METODI SET
	 */

	@Override
	public void approveAlias(String[] list) {
		for(String s : list) {
			Alias a = aliasDao.get(s);
			a.setApproved(true);
			aliasDao.getSession().beginTransaction();
			aliasDao.getSession().update(a);
			aliasDao.getSession().getTransaction().commit();
		}
		aliasDao.getSession().close();
	}
}