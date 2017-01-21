package com.stockmarket.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
//import com.stockmarket.controllers.*;
import com.stockmarket.*;
import com.stockmarket.login.Login;

@RestController
@RequestMapping("/")
public class LoginController {
	private LoginService loginservice;
	
	@Autowired
	public LoginController(LoginService loginserv){
		this.loginservice=loginserv;
	}
	
	/*@RequestMapping(value="login",method=RequestMethod.GET)
	public boolean authenticateGET(){
		Login login = new Login("Sonali", "Jha");
		 return loginservice.isValidUser(login);
	}
	*/
	//Login login = new Login();
	@RequestMapping(value="login",method=RequestMethod.POST)
	public boolean authenticate(@RequestBody Login login){
		 return loginservice.isValidUser(login);
	}
	/*
	@RequestMapping(value="marketCap",method=RequestMethod.POST)
	public  List<Stock> factoryCall( int marketCap){
		return loginservice.callToFactory(marketCap);
	}
	
	@RequestMapping(value="userHome",method=RequestMethod.GET)
	public  Customer factoryCall(@RequestParam String username){
	
		return loginservice.getCustomerDataFromRepo(username);
	}*/
	
	/*@RequestMapping(value="getLiveData",method=RequestMethod.GET)
	public  void getLiveData() throws IOException, JSONException {
		loginservice.getApiData();
	}
	*/
}
