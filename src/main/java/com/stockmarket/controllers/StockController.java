/*package com.stockmarket.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stockmarket.customer.Customer;
import com.stockmarket.stock.Stock;
import com.stockmarket.*;

@RestController
@RequestMapping("/userHome")
public class StockController {

	private LoginService loginservice;
	@Autowired
	public StockController(LoginService loginserv){
		this.loginservice=loginserv;
	}
	/*String uname;
	@RequestMapping(value="",method=RequestMethod.GET)
	public @ResponseBody boolean takeUsername(@RequestParam String username){
		uname=username;
		return true;
	}
	@RequestMapping(value="/dashboard/portfolio",method=RequestMethod.GET)
	public @ResponseBody Customer factoryCall(@RequestParam String username){
		return loginservice.getCustomerDataFromRepo(username);
	}

	@RequestMapping(value="/dashboard/marketCap",method=RequestMethod.POST)
	public  List<Stock> factoryCall( int marketCap){
		return loginservice.callToFactory(marketCap);
	}

}

*/