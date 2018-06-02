package com.antonio.clase2.loops;

/**
 * 
 * @author Antonio
 * Class WhileExPar
 */

public class WhileExPar {
	
	public static void main(String[] args) {
		
		//Impresion de numeros pares
		int i = 0;
		while(i <= 10) {
			if(i == 0) {
				i++;
			} else if(i%2 == 0) {
				System.out.println(i);
			}
			i++;
		}
	}
}
