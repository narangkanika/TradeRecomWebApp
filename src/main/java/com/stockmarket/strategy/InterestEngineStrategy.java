package com.stockmarket.strategy;

import com.stockmarket.customer.Customer;

public class InterestEngineStrategy {
 
	public static InterestEngine getInterestEngine(Customer customer){
		
		//Based on the input strategy class should be created and returned
		//condition to get strategy
		InterestEngine engine = new EnhancedInterestedEngine();
		return engine;
	}
	
}
