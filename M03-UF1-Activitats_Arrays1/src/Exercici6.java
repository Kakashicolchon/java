import java.util.Arrays;
import java.util.Scanner;

public class Exercici6 {

	public static void main(String[] args) {
		int valors[] = new int[10];
		Scanner s = new Scanner(System.in);
		boolean parellsAscendent = true;
		boolean senarsDescendent = true;
		
		// bucle que demarar� tans valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element " + (i+1) + ": " );
			valors[i] = s.nextInt();
		}
		
		System.out.println("________________________________");
		System.out.println("");
		
		//Recorrem la taula, comprovant si el valor de cada posici� �s ono, menor o igual que el seg�ent
		int i = 0;
		while (i < valors.length-3 && parellsAscendent == true && senarsDescendent == true) {
			
			if (valors[i+1] > valors[i+3]) {
				//Si trobem un valor d'una posici�parell de la taula que �s m�s gran que el valor de laseg�ent posici� parell aleshores les posicions parells no est�n en ordre ascendent
				parellsAscendent= false;
			}
			
			if (valors[i] < valors[i + 2]) {
				//Si trobem un valor d'una posici� senar de la taula que �s m�s petita que el valor de la seg�ent posici� senar, aleshores les posicions senars no estan en ordre descendent
			senarsDescendent = false;
			}
			i = i+2;
		}
		//Donem el resultat
		if (parellsAscendent == true && senarsDescendent == true) {
			System.out.println("Tots els valors est�n ordenats.");
		}
		else {
			System.out.println("Hi ha algun valor de la taula no est�n ordenats");
		}
		s.close();
	}	
	

}