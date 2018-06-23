package com.antonio.login.dao;

import java.util.List;

import com.antonio.login.model.Person;


public interface PersonDAO {
	
	public void insert(Person person);
	public List<Person> getAllPersons();
	public Person getById(int id);
	public Person getByEmail(String email);
	

}
