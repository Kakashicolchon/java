import java.util.Arrays;
import java.util.Scanner;

public class Exercici6 {

	public static void main(String[] args) {
		int valors[] = new int[10];
		Scanner s = new Scanner(System.in);
		boolean parellsAscendent = true;
		boolean senarsDescendent = true;
		
		// bucle que demararà tans valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element " + (i+1) + ": " );
			valors[i] = s.nextInt();
		}
		
		System.out.println("________________________________");
		System.out.println("");
		
		//Recorrem la taula, comprovant si el valor de cada posició és ono, menor o igual que el següent
		int i = 0;
		while (i < valors.length-3 && parellsAscendent == true && senarsDescendent == true) {
			
			if (valors[i+1] > valors[i+3]) {
				//Si trobem un valor d'una posicióparell de la taula que és més gran que el valor de lasegüent posició parell aleshores les posicions parells no estàn en ordre ascendent
				parellsAscendent= false;
			}
			
			if (valors[i] < valors[i + 2]) {
				//Si trobem un valor d'una posició senar de la taula que és més petita que el valor de la següent posició senar, aleshores les posicions senars no estan en ordre descendent
			senarsDescendent = false;
			}
			i = i+2;
		}
		//Donem el resultat
		if (parellsAscendent == true && senarsDescendent == true) {
			System.out.println("Tots els valors estàn ordenats.");
		}
		else {
			System.out.println("Hi ha algun valor de la taula no estàn ordenats");
		}
		s.close();
	}	
	

}