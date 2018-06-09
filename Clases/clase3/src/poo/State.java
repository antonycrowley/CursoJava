package poo;

/**
 * @author Antonio
 * State class: POJO
 */

public class State {
	private int id;
	private String name;
	private String abbv;
	
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAbbv() {
		return abbv;
	}
	public void setAbbv(String abbv) {
		this.abbv = abbv;
	}
	
	
	
	
	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", abbv=" + abbv + "]";
	}
	
	
	

}
