import java.util.Arrays;
import java.util.Scanner;

public class Exercici5 {

	public static void main(String[] args) {
		int valors[] = new int[5];
		Scanner s = new Scanner(System.in);
		boolean totsOrdenats = true;
		// bucle que demarar� tans valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element " + (i+1) + ": " );
			valors[i] = s.nextInt();
		}
		
		System.out.println("________________________________");
		System.out.println("");
		
		//Recorrem la taula, comprovant si el valor de cada posici� �s ono, menor o igual que el seg�ent
		int i = 0;
		while (i < valors.length-1 && totsOrdenats == true) {
			if (valors[i] > valors[i+1]) {
				//Si trobem un valor de la taula que �s m�s gran que el seg�ent aleshores indiquem que no est�n ordenats de petit a gran.
				totsOrdenats = false;
			}
			i++;
		}
		//Donem el resultat
		if (totsOrdenats) {
			System.out.println("Tots els valors de la taula estan ordenats de petit a gran.");
		}
		else {
			System.out.println("Hi ha algun valor a la taula que no est� ordenat de petit a gran.");
		}
		s.close();
	}	
	

}