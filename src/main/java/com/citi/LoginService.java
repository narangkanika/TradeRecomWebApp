package com.citi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
private LoginRepository loginRepo;
	
	@Autowired
	public LoginService(LoginRepository logRepository) {
		this.loginRepo = logRepository;
	}
	public boolean isValidUser(String username,String password){
		boolean ans=false;
		String storedPaswrd=loginRepo.getPassword(username);
		if(storedPaswrd.equals(password)){
			ans=true;
		}
		return ans;	
	}
}
