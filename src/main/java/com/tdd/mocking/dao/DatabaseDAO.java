package com.tdd.mocking.dao;

public class DatabaseDAO 
{
    public void save(String email) {
        System.out.println("Saved in database");
    }
    
    public void get(String email) {
        System.out.println("Available in database");
    }
}