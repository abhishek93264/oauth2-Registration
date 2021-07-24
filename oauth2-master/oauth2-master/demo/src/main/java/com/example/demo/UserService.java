package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public void processOAuthPostLogin(CustomOAuth2User user) {
		User existUser = repo.getUserByUsername(user.getEmail());
		
		if (existUser == null) {
			User newUser = new User();
			newUser.setUserName(user.getName());
			newUser.setProvider(Provider.GOOGLE);			
			newUser.setEmail(user.getEmail());
			repo.save(newUser);
			
			System.out.println("Created new user: " + user.getEmail());
		}
		
	}
	
}
