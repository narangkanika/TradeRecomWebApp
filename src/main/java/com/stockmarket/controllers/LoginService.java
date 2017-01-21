package com.stockmarket.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stockmarket.customer.Customer;
import com.stockmarket.login.Login;
//import com.stockmarket.stock.Stock;
import com.stockmarket.repositories.LoginRepository;
import com.stockmarket.stock.Stock;
import com.stockmarket.factory.*;

@Service
public class LoginService {
private LoginRepository loginRepo;

	@Autowired
	public LoginService(LoginRepository logRepository) {
		this.loginRepo = logRepository;
	}
	
	
	
	public boolean isValidUser(Login login){
		//Customer customer = new Customer();
		String username=login.getUsername();
		String password=login.getPassword();
		
		String storedPaswrd=loginRepo.getPassword(username);
		//System.out.println("Password from user: "+password);
		//System.out.println("Password from db: "+storedPaswrd);
		if(storedPaswrd.equals(password)){
			System.out.println("Matched paswrds");
			//customer.setUsername(username);
			return true;
		}
		else
			return false;	
	}
	
	//example using for test cases//del after use
	public boolean areFirstAndLastTwoCharactersTheSame(String str) {

		if (str.length() <= 1)
			return false;
		if (str.length() == 2)
			return true;

		String first2Chars = str.substring(0, 2);

		String last2Chars = str.substring(str.length() - 2);

		return first2Chars.equals(last2Chars);
	}
	
	
	
	public List<Stock> callToFactory(int marketCapital) {
		List<Stock> listOfStocks=new ArrayList<Stock>();
		MarketCapFactory marketCapFactory=new MarketCapFactory();
		MarketCap marketCap;
		marketCap=marketCapFactory.getMarketCap(marketCapital);
		String query=marketCap.displayAllStocks();
		System.out.println(query);//delthis
		listOfStocks=loginRepo.getStockData(query);
		int i=0;
		while(!listOfStocks.isEmpty())
		{
			System.out.println(listOfStocks.get(i).getMarketCapType());
			i++;
		}
		return listOfStocks;
	}
	public Customer getCustomerDataFromRepo(String username) {
		//customer=loginRepo.getCustomerDetails(username);
		//return this.customer;
		return null;
	}
	public void getApiData() throws IOException{
		List<Stock> list=new ArrayList<Stock>();
		//list=stockData.fetchStockData();
		loginRepo.updateStockData(list);
	}
}
