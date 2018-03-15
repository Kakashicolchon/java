import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		int [] valors = new int[5];
		Scanner s = new Scanner(System.in);
		int parells = 0;
		int senars = 0;
		
		//bucle que demanarà tants valors com la mida de la taula.
		for (int i = 0; i < valors.length; i++) {
			System.out.print("Introdueix l'element num " + (i + 1) + ": ");
			valors[i] = s.nextInt();
			
		}
		//Recorremla taula, comptant els valors parells i senars que hi ha
		for (int i = 0; i < valors.length; i++) {
			//Comprovem si el valor actual és parell o senar, i incrementem el comptador corresponent.
			if (valors[i] % 2 == 0) {
				parells++;
			}
			else {
				senars++;
			}
		}
		//Mostrem el resultat
		System.out.println("Quantitat de nombres parells: " + parells);
		System.out.println("Quantitat de nombres senars: " + senars);
	}

}
