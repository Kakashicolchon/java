import java.util.Arrays;
import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		int valors[] = new int[5];
		Scanner s = new Scanner(System.in);
		boolean totsParells = true;
		// bucle que demararà tans valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element " + (i+1) + ": " );
			valors[i] = s.nextInt();
		}
		
		System.out.println("________________________________");
		System.out.println("");
	
		//Preguntem a l'usuari el numero que volem comptar les vegades que apareix a la taula.
		
		
		//Recorrem la taula, comprovant si el valor de cada posició és o no parell
		for (int i = 0; i < valors.length; i++) {
			//Si trobem un valor de la taula que conté un valor senar, ho indiquem posant a false la variable totsParells
			if (valors[i] % 2 != 0 ) {
				totsParells = false;
				break;
			}
		}
		//Donem el resultat segons el valor de la variable totsParells
		if (totsParells) {
			System.out.println("Tots els valors de la taula son parells ");
		}
		else {
			System.out.println("Hi ha alguns valors senars a la taula");
		}
		s.close();
	}	
	

}