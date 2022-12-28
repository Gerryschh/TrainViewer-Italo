package com.ChainResponsibility;

import com.dao.AliasDao;
import com.dao.CountryDao;
import com.dao.impl.AliasDaoImpl;
import com.dao.impl.CountryDaoImpl;
import com.beans.Alias;
import com.strategy.Strategy;

public abstract class CheckChain {
	private CheckChain nextChain;
	private static Strategy strategy;
	private AliasDao dao = new AliasDaoImpl();
	private CountryDao cdao = new CountryDaoImpl();	
	
	public void setNextChain(CheckChain nextChain) {
		this.nextChain=nextChain;
	}
	public final String check(String input) {
		String result = checkInternal(input);
		if(result != null) {
			Alias a = new Alias();
			a.setAlias(input);
			a.setCountry(cdao.get(result));
			a.setApproved(false);
			dao.create(a);
			System.out.println("Il risultato è "+result);
			return result;
		}
		//non ho trovato la soluzione, procedo col successivo se c'è
		if (nextChain!= null)
			return this.nextChain.check(input);
		else {
			strategy.addAliasUnknown(input);
        	return null;
			}
		}
	
	protected abstract String checkInternal(String input);
	
	
	public Strategy getStrategy() {
		return strategy;
	}
	public void setStrategy(Strategy strategy) {
		CheckChain.strategy = strategy;
	}
	
}
