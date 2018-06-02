package com.antonio.clase2;

import java.util.Scanner;

/**
 * 
 * @author Antonio
 * Clase IfStatementEx1
 */

public class IfStatementEx1 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Capture un valor entero");
		int input1 = scan.nextInt();
		System.out.println("Capture otro valor entero");
		int input2 = scan.nextInt();
		
		scan.close();
		
		if(input1 == input2) {
			System.out.println(input1 + " es igual a: " + input2);
		} else if(input1 < input2){
			System.out.println(input1 + " es menor a: " + input2);
		} else if(input1 > input2) {
			System.out.println(input1 + " es mayor a: " + input2);
		}
		
		if(input1 >= input2) {
			System.out.println(input1 + " es mayor o igual a: " + input2);
		}
		
		if(input1 <= input2) {
			System.out.println(input1 + " es menor o igual a: " + input2);
		}
		
		if(input1 != input2) {
			System.out.println(input1 + " es diferente a: " + input2);
		}
		
	}

}
