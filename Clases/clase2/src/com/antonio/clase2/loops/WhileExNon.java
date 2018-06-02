package com.antonio.clase2.loops;

/**
 * 
 * @author Antonio
 * Class WhileExNon
 */

public class WhileExNon {
	
	public static void main(String[] args) {
		
		//Impresion de numeros nones
		int i = 0;
		while(i <= 10) {
			
			
			if(i%2 != 0) {
				System.out.println(i);
			}
			i++;
		}	
	}
}
