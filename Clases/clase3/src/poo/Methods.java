package poo;

/**
 * @author Antonio
 * Clase Methods
 */

public class Methods {
	
	// Metodo main corre la aplicacion
	public static void main(String[] args) {
		
		int result = suma(1, 2);
		System.out.println(result);
		
		tabla(5);
		
	}
	
	/*
	 * Modificador de acceso - tipo de retorno - nombre del metodo(parametros){
	 *     ----
	 * }
	 */
	
	/*
	 * Metodo suma;
	 * regresa la suma de dos numeros.
	 * 
	 * @param num1
	 * @param num2
	 * @return num1 + num2
	 */
	public static int suma(int num1, int num2) {
		return num1 + num2;
	}
	
	public static void tabla(int number) {
		for(int i = 0; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}

}
