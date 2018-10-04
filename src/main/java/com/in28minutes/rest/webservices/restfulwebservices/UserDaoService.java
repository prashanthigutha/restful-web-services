package com.in28minutes.rest.webservices.restfulwebservices;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users= new ArrayList<>();

	static 
	{
		users.add(new User(1,"A",new Date()));
		users.add(new User(2,"B",new Date()));
		users.add(new User(3,"C",new Date()));
		
		
	}
	
	public static int userCounter=3;
	public List<User> findAll()
	{
		return users;
		
	}
	
	public User addUser(User user)
	{
		
		if(user.getId()==null)
			user.setId(++userCounter);
		
		users.add(user);
		return user;
	}
	
	public User findOne(int Id)
	{
		for(User user:users)
		{
			if(user.getId()==Id)
				return user;
		}
		return null;
		
		
	}
}
