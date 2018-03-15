import java.util.Arrays;
import java.util.Scanner;

public class Exercici2 {

	public static void main(String[] args) {
		int valors[] = new int[5];
		Scanner s = new Scanner(System.in);
		// bucle que demararà tans valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element " + i + ": " );
			valors[i] = s.nextInt();
		}
		
		System.out.println("________________________________");
		System.out.println("");
		//Mostrem la taula abans de sumar 1 a cada posició
		System.out.println("Taula abans: " + Arrays.toString(valors));
		
		
		//Preguntem a l'usuari el numero que volem comptar les vegades que apareix a la taula.
		
		
		//Recorrem la taula, sumant 1 a cada posició
		for (int i = 0; i < valors.length; i++) {
			valors[i]++;
		}
		//Donem el resultat
		System.out.println("Taula després " + Arrays.toString(valors));
		s.close();
	}	
	

}