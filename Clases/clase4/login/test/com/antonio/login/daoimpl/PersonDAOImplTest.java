package com.antonio.login.daoimpl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.junit.Test;

import com.antonio.login.dao.DAOFactory;
import com.antonio.login.dao.PersonDAO;
import com.antonio.login.model.Person;

public class PersonDAOImplTest {

	@Test
	public void insertTest() {
		PersonDAO personDao = new PersonDAOImpl();
		Person person = new Person();

		person.setName("Claudia");
		person.setLastName("Perez");
		person.setEmail("claudia@gmail.com");
		person.setAge(30);
		person.setAddress("Monterrey");
		person.setPassword("password3");

		personDao.insert(person);
	}

	@Test
	public void getAllPersonTest() {
		PersonDAO personDao = new PersonDAOImpl();
		List<Person> persons = personDao.getAllPersons();

		for (Person person : persons) {
			System.out.println(person);
		}
	}

	@Test
	public void getByEmailTest() {
		String email = "claudia@gmail.com";
		PersonDAO personDao = new PersonDAOImpl();
		Person person = personDao.getByEmail(email);
		System.out.println(person);
		assertEquals("Claudia", person.getName());
	}
}
