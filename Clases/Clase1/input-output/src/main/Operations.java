package main;

import java.util.Scanner;
	
public class Operations{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero entero");
		int inputInt1 = scan.nextInt();
		System.out.println("Ingrese un numero entero");
		int inputInt2 = scan.nextInt();
		
		System.out.println("la suma es: " + (inputInt1 + inputInt2));
		System.out.println("la diferencia es: " + (inputInt1 - inputInt2));
		System.out.println("la multiplicacion es: " + (inputInt1 * inputInt2));
		System.out.println("la division es: " + (inputInt1 / inputInt2));
	}
}

