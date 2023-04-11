package com.rentia.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rentia.models.User;
import com.rentia.services.UserService;

@CrossOrigin
@RestController
@RequestMapping("/user")
public class UserController 
{
    	
	@Autowired
    private UserService userService;

	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User user ) {
		
		try{
			System.out.println(user);
			userService.registerUser(user);
			String s="Hi  " + user.getName() + "  your Registration Process successfully completed. Now Please Login to Continue";
			return new ResponseEntity<String>(s, HttpStatus.OK);
         
		}
		catch(Exception ex){
			return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
		}
  
}
	
}


	


