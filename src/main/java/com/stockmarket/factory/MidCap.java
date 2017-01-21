package com.stockmarket.factory;

import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;
import com.stockmarket.strategy.InterestEngine;

public class MidCap implements MarketCap {
	public Stock[] displayTopFive(Customer customer) {
		// TODO Auto-generated method stub
		System.out.println("You selected Mid cap");
		return null;
	}

	@Override
	public void setStrategy(InterestEngine strategy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String displayAllStocks() {
		String query="select * from Stocks where Market_Capitalization<=10000000000 and Market_Capitalization>=300000000";
		return query;
	}

}
