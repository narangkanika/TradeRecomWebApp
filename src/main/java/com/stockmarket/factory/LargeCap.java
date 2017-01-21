package com.stockmarket.factory;


import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;
import com.stockmarket.strategy.InterestEngine;

public class LargeCap implements MarketCap {
	public Stock[] displayTopFive(Customer customer) {
	
		System.out.println("You selected Large Cap");
		return null;
	}

	@Override
	public void setStrategy(InterestEngine strategy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String displayAllStocks() {
		String query="select * from Stocks where Market_Capitalization>=10000000000";
		return query;
	}
}
