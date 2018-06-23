package com.antonio.login.view;

import java.util.List;

import com.antonio.login.dao.PersonDAO;
import com.antonio.login.daoimpl.PersonDAOImpl;
import com.antonio.login.model.Person;

public class TestPersonDAO {
	
	public static void main(String[] args) {
		
		printUsers();
	
	}
	
	public static void createPerson() {
		Person person = new Person();
		
		person.setName("Claudia");
		person.setLastName("Perez");
		person.setEmail("claudia@gmail.com");
		person.setAge(30);
		person.setAddress("Monterrey");
		person.setPassword("password3");
		
		PersonDAO personDao = new PersonDAOImpl();
		personDao.insert(person);
	}
	
	public static void printUsers() {
		PersonDAO personDao = new PersonDAOImpl();
		List<Person> persons = personDao.getAllPersons();
		
		for (Person person : persons) {
			System.out.println(person);
		}
	}

}
