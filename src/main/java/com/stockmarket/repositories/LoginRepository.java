package com.stockmarket.repositories;
import java.util.List;

import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;

public interface LoginRepository {

	String getPassword(String username);

	Customer getCustomerDetails(String username);

	List<Stock> getStockData(String query);

	void updateStockData(List<Stock> list);

}
