package loops;

/**
 * @author Antonio Arrays
 */

public class Arrays {

	// Metodo main corre la aplicacion
	public static void main(String[] args) {

		int[] a = new int[6];
		int[] b = { 1, 2, 3, 4, 5, 6 };

		a[0] = 4;

		System.out.println(a[0]);
		System.out.println(b[0]);

		for (int i = 0; i <= b.length - 1; i++) {
			System.out.println(b[i]);
		}
		
		
		
		/*
		 * For Each
		 * itera sobre los elementos de un arreglo
		 * for( objeto : Arreglo de tipo "objeto" ) {
		 *     ----
		 *     ----
		 * }
		 */
		
		for(int i : b) {
			System.out.println(i);
		}
		
		String[] strArray = {"elemento1", "elemento2", "elemento3", "elemento4", "elemento5", "elemento6"};
		
		for(String string : strArray) {
			System.out.println(string);
		}

	}

}
