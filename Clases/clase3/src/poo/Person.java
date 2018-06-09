package poo;

/**
 * @author Antonio
 * Person class
 * 
 * Plain Old Java Object (POJO)
 * 
 * POJO:
 * 1. Variables de instancia
 * 2. COnstructores
 * 3. Getters & Setters
 * 4. toString()
 */

public class Person {
	
	/*
	 * Variables de instancia
	 */
	
	/*
	 * Modificadores de acceso.
	 * public: 		Existen para todo el proyecto.
	 * private:		Solo existen para la clase en la que se define.
	 * protected:	Existen para la jerarquia de herencia de la clase.
	 * default:		Existe para todo el paquete en el que se encuentra la clase.
	 */
	
	private String name;
	private String lastName;
	private int age;
	private City city;
	private State state;
	
	
	/*
	 * Metodos
	 */
	
	public Person() {
		City city = new City();
		city.setId(1);
		city.setName("Monterrey");
		
		State state = new State();
		state.setId(1);
		state.setName("Nuevo Leon");
		state.setAbbv("NL");
		
		this.city = city;
		this.state = state;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void run() {
		System.out.println("Person is running");
	};

	public void eat() {
		System.out.println("Person is eating");
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + ", age=" + age + ", city=" + city + ", state="
				+ state + "]";
	};
	
	
	


}
