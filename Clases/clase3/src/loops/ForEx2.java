package loops;

/**
 * @author Antonio
 * Clase ForEx2
 */

public class ForEx2 {
	
	// Metodo main corre la aplicacion
	public static void main(String[] args) {
		
		for(char letter = 'a'; letter <= 'z'; letter++){
			System.out.print(letter + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i <= 500; i++){
			char a = (char) i;
			System.out.println(a + " = " + i);
		}
	}
}
