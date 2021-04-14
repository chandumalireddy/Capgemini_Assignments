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
	userRepo u;

	public user finduser(String username)
	{
		user e=u.findByUsername(username);
		return e;
	}
	
	public List<user> getallTrain(){
		List<user> t=new ArrayList<>();
		u.findAll()
		.forEach(t::add);
		return t;
	
	}
	public user create(user s) {
		try {
			if (u.existsByUsername(s.getUsername())) {
			throw new EntityCreationException("userdetails already exists");
			} else {
				return u.save(s);
			}
		} catch (Exception e) {
			throw new EntityCreationException(e.getMessage());
		}
	}
	}

	

