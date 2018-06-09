package loops;

/**
 * 
 * @author Antonio
 * Clase ForEx
 */

public class ForEx {
	

	
	// Metodo main - corre la aplicacion
	public static void main(String[] args) {
		
		/*
		 * For loop
		 * 
		 * for(variable de iteracion; condicion; incremento){
		 *     ------
		 *     ------
		 * }
		 */
		
		long startTime = System.nanoTime();
		for(int i = 0; i <= 500; i++) {
			int x = 5;			// Numero a Desplegar en la tabla
			System.out.println(x + " * " + i + " = " + (x * i));
		}
		long endTime = System.nanoTime();
		
		long duration = (endTime - startTime);
		System.out.println(duration/1000 + " microseconds");
	}

}
