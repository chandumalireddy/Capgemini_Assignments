package com.casestudy;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class bookingService {
	
	@Autowired
	bookRepo b;
	
	public booking add(booking e)
	{
		return b.save(e);
	}
	
	public List<booking> showall(){
		List<booking> t=new ArrayList<>();
		b.findAll()
		.forEach(t::add);
		return t;
	
	}
	public List<booking> getbyuser(String name){
		
			
			
			List<booking> f=b.findByusername(name);
			
			return f;
			
		}
	
	public booking getbypnr(String pnr){
		
		
		
		booking f=b.findBypnr(pnr);
		
		return f;
		
	}
	public void deleteByPnr(String pnr)
	{
		b.deleteBypnr(pnr);
	}
	
}
