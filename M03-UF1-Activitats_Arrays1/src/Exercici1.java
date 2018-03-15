import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		int valors[] = new int[5];
		int numeroAComptar;
		int vegades = 0;
		Scanner s = new Scanner(System.in);
		// bucle que demararà tans valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element " + i + ": " );
			valors[i] = s.nextInt();
		}
		//Preguntem a l'usuari el numero que volem comptar les vegades que apareix a la taula.
		
		System.out.print("Quin és el número que vols comptar? ");
		numeroAComptar = s.nextInt();
		
		//Recorrem la taula comprovant per cada posició si conté el valor que l'usuari demana comptar.
		for (int i = 0; i < valors.length; i++) {
			if (valors[i] == numeroAComptar) {
				vegades++;
			}
		}
		//Donem el resultat
		System.out.println("El numero " + numeroAComptar + " apareix " + vegades + " vegades a la taula.");
		s.close();
	}	
	

}
