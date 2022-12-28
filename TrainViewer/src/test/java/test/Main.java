package test;

import java.util.List;
import java.util.Map;

import com.ChainResponsibility.CheckChain;
import com.ChainResponsibility.CheckChainBuilder;
import com.strategy.Strategy;
import com.strategy.StrategyDB;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Strategy s= new StrategyDB();
		Map<String, List<String>> map= s.dataMap();
		CheckChain chain=CheckChainBuilder.getChain(s);
		chain.check("china");
	}

}
