package com.strategy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import com.connectionDB.ConnectionToDB;
import com.dao.AliasDao;
import com.dao.AliasUnknownDao;
import com.dao.impl.AliasDaoImpl;
import com.dao.impl.AliasUnknownDaoImpl;
import com.beans.Alias;
import com.beans.AliasUnknown;
import com.beans.Country;

public class StrategyDB implements Strategy{
	//WIP serve l'RMI
	static Session session = ConnectionToDB.getSession();
	private AliasUnknownDao unknownDao = new AliasUnknownDaoImpl();
	private AliasDaoImpl aliasDao = new AliasDaoImpl();
	private Map<String,List<String>> dataMap;
	public String getAliasCountry(String input) {
	    String query = "select nome_paese from alias where alias_paese = " + input;
	    NativeQuery<String> q = session.createSQLQuery(query);
	    return q.getSingleResult();
	}	

	
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
	
	public void addAliasUnknown(String input) {
		AliasUnknown au = new AliasUnknown();
		au.setUnknown(input);
		unknownDao.create(au);
	}
	
	@Override
	public Set<String> getCountryNames() {
		// TODO Auto-generated method stub
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
			Country c = new Country();
			c.setCountryName((String) o[1]);
			a.setCountry(c);
			ca.add(a);
		}
		return ca;
	}


	@Override
	public void approveAlias(String[] list) {
		for(String s : list)
		{
			Alias a = aliasDao.get(s);
			a.setApproved(true);
			aliasDao.getSession().beginTransaction();
			aliasDao.getSession().update(a);
			aliasDao.getSession().getTransaction().commit();
		}
		aliasDao.getSession().close();
	}
	
}