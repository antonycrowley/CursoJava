package com.antonio.clase2;

public class ArithmeticOperators {
	
	//Metodo main corre la aplicacion
	public static void main(String[] args) {
		/*
		 *  Operadores basicos
		 *  
		 *  Suma: +
		 *  Resta: -
		 *  Multiplicacion: -
		 *  Division: / 
		 *  Modulus: %
		 */
		int val1 = 10;
		int val2 = 3;
		int result;
		
		result = val1 + val2; System.out.println(result);
		result = val1 - val2; System.out.println(result);
		result = val1 * val2; System.out.println(result);
		result = val1 / val2; System.out.println(result);
		result = val1 % val2; System.out.println(result);
		
		
		/*
		 * Operadores de incremento / decremento
		 * 
		 * Incremento: ++
		 * Decremento: --
		 */
		
		
		System.out.println("---------------Operadores de incremente/decremento---------------");
		int val3 = 10;
		System.out.println(val3++);
		System.out.println(val3);
		
		val3 = 10;
		System.out.println(++val3);
		System.out.println(val3);
		
		System.out.println("decremento");
		val3 = 10;
		System.out.println(val3--);
		System.out.println(val3);
		
		val3 = 10;
		System.out.println(--val3);
		System.out.println(val3);
		
		
		/*
		 * Operadores de asignacion
		 * 
		 * Suma: +=
		 * Resta: -=
		 * Multiplicacion: *=
		 * Division: /=
		 * Modulus: %=
		 */
		
		
		System.out.println("Asignacion");
		int val4 = 100;
		val4 += 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 -= 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 *= 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 /= 10;
		System.out.println(val4);
		
		val4 = 100;
		val4 %= 10;
		System.out.println(val4);
	}

}
