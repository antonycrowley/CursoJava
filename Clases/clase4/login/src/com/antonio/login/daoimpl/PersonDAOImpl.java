package com.antonio.login.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.antonio.login.dao.DAOFactory;
import com.antonio.login.dao.PersonDAO;
import com.antonio.login.model.Person;

public class PersonDAOImpl implements PersonDAO {

	// Declaracion de queries
	private static final String INSERT_QUERY = "INSERT INTO PERSON (Id, Name, Last_Name, Email, Age, Address, Password) VALUES (NULL, ?, ?, ?, ?, ?, ?)";
	private static final String GET_ALL = "SELECT *FROM PERSON";
	private static final String FIND_BY_ID = "SELECT * FROM PERSON WHERE Id = ?";
	private static final String FIND_BY_EMAIL = "SELECT * FROM PERSON WHERE email = ?";

	@Override
	public void insert(Person person) {
		// Abrimos la conexion a sql
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(INSERT_QUERY);
			preparedStatement.setString(1, person.getName());
			preparedStatement.setString(2, person.getLastName());
			preparedStatement.setString(3, person.getEmail());
			preparedStatement.setInt(4, person.getAge());
			preparedStatement.setString(5, person.getAddress());
			preparedStatement.setString(6, person.getPassword());
			preparedStatement.executeUpdate();
			System.out.println("Person Saved correctly");

			preparedStatement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Person> getAllPersons() {
		// Abrimos la conexion a sql
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		List<Person> personsList = new ArrayList<>();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(GET_ALL);

			Person person = null;
			while (resultSet.next()) {
				person = new Person();

				person.setId(Integer.parseInt(resultSet.getString("Id")));
				person.setName(resultSet.getString("Name"));
				person.setLastName(resultSet.getString("Last_Name"));
				person.setEmail(resultSet.getString("Email"));
				person.setAge(Integer.parseInt(resultSet.getString("Age")));
				person.setAddress(resultSet.getString("Address"));
				person.setPassword(resultSet.getString("Password"));

				personsList.add(person);
			}
			resultSet.close();
			statement.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return personsList;
	}

	@Override
	public Person getById(int id) {
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		Person person = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_ID);
			preparedStatement.setInt(1, id);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				person = new Person();

				person.setId(Integer.parseInt(resultSet.getString("Id")));
				person.setName(resultSet.getString("Name"));
				person.setLastName(resultSet.getString("Last_Name"));
				person.setEmail(resultSet.getString("Email"));
				person.setAge(Integer.parseInt(resultSet.getString("Age")));
				person.setAddress(resultSet.getString("Address"));
				person.setPassword(resultSet.getString("Password"));
			}

			resultSet.close();
			connection.close();
			return person;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Person getByEmail(String email) {
		Connection connection = DAOFactory.getMySqlDB().openConnection();
		Person person = null;
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(FIND_BY_EMAIL);
			preparedStatement.setString(1, email);

			ResultSet resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {
				person = new Person();

				person.setId(Integer.parseInt(resultSet.getString("Id")));
				person.setName(resultSet.getString("Name"));
				person.setLastName(resultSet.getString("Last_Name"));
				person.setEmail(resultSet.getString("Email"));
				person.setAge(Integer.parseInt(resultSet.getString("Age")));
				person.setAddress(resultSet.getString("Address"));
				person.setPassword(resultSet.getString("Password"));
			}

			resultSet.close();
			connection.close();
			return person;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
