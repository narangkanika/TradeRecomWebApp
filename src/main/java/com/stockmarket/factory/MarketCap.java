package com.stockmarket.factory;
import java.util.List;

import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;
import com.stockmarket.strategy.InterestEngine;

public interface MarketCap {

	void setStrategy(InterestEngine strategy);
	
	public Stock[] displayTopFive(Customer customer);
	
	public String displayAllStocks();

	
}
