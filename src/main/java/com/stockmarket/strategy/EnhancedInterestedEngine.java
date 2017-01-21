package com.stockmarket.strategy;

public class EnhancedInterestedEngine implements InterestEngine {

	@Override
	public double getApplicableRate() {
		// TODO Auto-generated method stub
		System.out.println("Inside enhanced interest eng");
		double rate=9.5;
		return rate;
	}

}
