package com.citi;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class LoginController {
	private LoginService loginservice;
	@Autowired
	public LoginController(LoginService loginserv){
		this.loginservice=loginserv;
	}
	/*@RequestMapping(method=RequestMethod.GET)
	public String home() {
		//List<Login> logins = loginservice.isValidUser();
		//model.put("logins", logins);
		return "home";
		
	}*/
	@RequestMapping(value="login",method=RequestMethod.GET)
	public String authenticateUser(@RequestParam("uname") String username,@RequestParam("passwrd") String password){
		return loginservice.isValidUser(username,password)+"";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String authenticate(@RequestParam("uname") String username,@RequestParam("passwrd") String password){
		return loginservice.isValidUser(username,password)+"";
	}

	

}
