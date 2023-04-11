package com.rentia.services;

import java.util.Date;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.rentia.daos.UserDao;
import com.rentia.models.User;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;

	public User registerUser(User user)
	{
		try
		{
			user.setRole("TENANT");
			user.setCreationDate(new Date());
			User l_user = userDao.registerUser(user);
			return l_user;
		}
		catch(Exception e)
		{
		   return null;
		}
		
		
	}
	
}
