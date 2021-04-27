package com.casestudy.user;

import java.util.ArrayList;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.casestudy.exeption.EntityCreationException;

@Service
public class userService {

	
	@Autowired
	userRepo userRepository;
	
//This will find user from repository
	public user finduser(String username)
	{
		user e=userRepository.findByUsername(username);
		return e;
	}
	//This will find allUsers from repository
	public List<user> getallTrain()
	{
		List<user> t=new ArrayList<>();
		userRepository.findAll()
		.forEach(t::add);
		return t;
	
	}
	//This will Create new user from repository
	public user create(user newUser) {
		try {
			if (userRepository.existsByUsername(newUser.getUsername()))
			{
			throw new EntityCreationException("userdetails already exists");
			}
			else 
			{
				return userRepository.save(newUser);
			}
		} 
		catch (Exception e)
		{
			throw new EntityCreationException(e.getMessage());
		}
	}
	}

	

