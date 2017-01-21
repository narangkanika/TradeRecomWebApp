package com.stockmarket.factory;

import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;
import com.stockmarket.strategy.InterestEngine;
import com.stockmarket.strategy.InterestEngineStrategy;

public class SmallCap implements MarketCap{
	private InterestEngine strategy;
	

	@Override
	public void setStrategy(InterestEngine strategy) {
		// TODO Auto-generated method stub
		this.strategy=strategy;
	}

	@Override
	public Stock[] displayTopFive(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String displayAllStocks() {
		String query="select * from Stocks where Market_Capitalization<=2000000000 and Market_Capitalization>=300000000";
		return query;
	}
	
}
