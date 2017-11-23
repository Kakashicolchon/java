import java.util.Random;
import java.util.Scanner;
public class Exercici15 {

	public static void main(String[] args) {
		Random r = new Random (System.currentTimeMillis());
		Scanner s = new Scanner(System.in);
		int carta;
		boolean finalDeJoc = false;
		double puntuacio = 0;
		int resposta;
		//bucle principal del joc, que ens anirà demanant si volem
		//carta i gestionarà la puntuació
		do {
			//Preguntem a l'suari sivol carta.
			System.out.print("Vols carta? (1 = Sí - 2 = No) : ");
			resposta = s.nextInt();
			//Comrpvem la resposta
			if (resposta == 1) {
				//Hi haurà tot el joc
				//Generar nombre aleatori 1 - 7 i 10-12
				do {
					carta = r.nextInt(12)+1;
				} while (carta == 8 || carta == 9);
				//Actualitzem puntuació de l'usuari
				if (carta>=1 && carta <= 7) {
					puntuacio = puntuacio + carta;
					//Si ens ha sortit una carta de l'1 al 7, sumem
					//directament els punts de la carta.
				}
				else {
					//Si ens ha sortit una figura (10,11 o 12), sumem
					//Mig punt.
					puntuacio = puntuacio + 0.5;
				}
				if (puntuacio > 7.5) {
					//El jugador s'ha passat
					System.out.println("Ho sento, t'has passat. Tens: " + puntuacio + "punts.");
				}
				else if (puntuacio == 7.5) {
					//El jugador ha aconseguir 7 i mig.
					System.out.println("Mu bieeng, has fet 7 i mig!");
					finalDeJoc = true;
				}
				else {
					//El jugador no ha arribat a 7 i mig.
					System.out.println("La teva puntuació actual és: " + puntuacio + "punts.");
				}
				
			}
			else {
				//El jugador decideix plantar-se
				System.out.println("T'has plantat amb " + puntuacio + "punts. ");
				finalDeJoc = true;
			}
		} while (finalDeJoc == false);
		s.close();	
	}

}
