package com.tdd.mocking.service;

import com.tdd.mocking.dao.DatabaseDAO;

public class UserInfoService {
	DatabaseDAO database;
	
	 public boolean save(String email) 
	    {
	        database.save(email);
	        System.out.println("Saved email in database");
	         
	        return true;
	    }
	 
	 public boolean get(String email) 
	    {
	        database.get(email);
	        System.out.println("Email available in database");
	         
	        return true;
	    }

}
