package com.antonio.clase2;

/**
 * 
 * @author Antonio
 * Clase IfStatement
 */


public class IfStatement {
	
	//Metodo main corre la aplicacion
	public static void main(String[] args) {
		
		/*
		  if(condition) {
			  System.out.println("string");
			  //Este bloque de codigo solo se va a ejectuar si la condicion es verdadera
		  }
		*/
		
	/*	
	   Operadores de comparacion
	       a == b
		   a < b
		   a > b
		   a >= b
		   a <= b
		   a != b
	*/
		
		//Sentencias If evaluan una condicion
		int val = 5;
		int val2 = 10;
		
		if(val == val2) {
			System.out.println(val + " es igual a: " + val2);
		} else if(val < val2){
			System.out.println(val + " es menor a: " + val2);
		} else if(val > val2) {
			System.out.println((val + " es mayor a: " + val2));
		}
		
		/*
		 * Ternary operator
		 * result = condition ? trueValue : falseValue
		 */
		
		System.out.println("Ternary Operator");
		String str = (val > val2) ? "La condicion es Verdadera" : "La condicion es falsa";
		System.out.println(str);
		
	}

}
