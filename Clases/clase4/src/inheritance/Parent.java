package inheritance;

import java.util.List;

/**
 * 
 * @author Antonio
 * Class Perent
 */

public class Parent {
	
	private String stringVar;
	private Integer intVar;
	
	/*
	 *  Collections & Generics
	 *  List<Object> list;
	 *  
	 *  
	 */
	
	private List<String> strList;
	
	/*
	 * Overloading
	 */
	
	public void sum(int a, int b) {
		System.out.println("La suma es: " + (a + b));
	}
	public void sum(String a, String b) {
		int sum = Integer.parseInt(a) + new Integer(b);
		System.out.println(sum);
	}
	public int sum(int a, int b, int c) {
		return a+b+c;
	}
	public void printListValues() {
		for(String string : strList) {
			System.out.println(string);
		}
	}
	
	
	
	public String getStringVar() {
		return stringVar;
	}
	public void setStringVar(String stringVar) {
		this.stringVar = stringVar;
	}
	public Integer getIntVar() {
		return intVar;
	}
	public void setIntVar(Integer intVar) {
		this.intVar = intVar;
	}
	public List<String> getStrList() {
		return strList;
	}
	public void setStrList(List<String> strList) {
		this.strList = strList;
	}
	
	
	@Override
	public String toString() {
		return "Parent [stringVar=" + stringVar + ", intVar=" + intVar + "]";
	}
	
	

}
