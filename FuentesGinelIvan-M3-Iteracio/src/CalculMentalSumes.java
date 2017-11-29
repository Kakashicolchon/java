import java.util.Random;
import java.util.Scanner;

public class CalculMentalSumes {

	public static void main(String[] args) {
		int valorMin = 0; 
		int valorMax = 0;
		int nombreOperacions = 0;
		int tempsResposta = 0;
		int nombreOperands = 0;
		int encerts = 0;
		int valorAleatori;
		int resultatUsuari;
		int resultatReal;
		long tempsInicial;
		long tempsFinal;
		double tempsTranscorregut;
		int errorsPerTemps = 0;
		Random r = new Random(System.nanoTime());
		Scanner s = new Scanner (System.in);
		//1- Preguntem els valors maxims i minims per operand
		do {
			System.out.print("Digues el valor mínim dels numeros en cada operand: ");
			valorMin = s.nextInt();
			System.out.print("Digues el valor max dels numeros en cada operand: ");
			valorMax = s.nextInt();
			
			if (valorMin > valorMax || valorMin  <= 0) {
				System.out.println("No heu introduït els valors correctes.");
				System.out.println("Recodeu que el 0 tampoc és un valor acceptat");
				
			}
		} while (valorMin > valorMax || valorMin  <= 0);
		//Preguntem la quantitat d'operands
		do {
			System.out.print("Digues quants operands vols per operació: ");
			nombreOperands = s.nextInt();
			if (nombreOperands <=1) {
				System.out.println("No has introduït un numero correcte d'operands");
			}
		} while (nombreOperands <= 1);
		
		
		//2- Preguntem la quantitat d'operacions.
		do {
			System.out.print("Digues quantes operacions vols que siguin proposades: ");
			nombreOperacions = s.nextInt();
			if (nombreOperacions <=0) {
				System.out.println("No has introduït un numero correcte d'operacions proposades.");
			}
		} while (nombreOperacions <= 0);
		//3- Preguntem el temps máxim de resposta per cada operació
		do {
			System.out.print("Temps de resposta per operació(segons): ");
			tempsResposta = s.nextInt();
			if (tempsResposta <= 0) {
				System.out.println("No has introduït un numero correcte com a temps de resposta de les operacions");
			}
		} while (tempsResposta <= 0);
		//4- Fem les operacions
		
		for (int i = 1; i <= nombreOperacions ; i++) {
			valorAleatori = valorMin + r.nextInt(valorMax - valorMin +1);
			resultatReal = valorAleatori;
			System.out.print("Operacio " + i + ": " + valorAleatori);
			for (int j = 1; j < nombreOperands; j++) {
				valorAleatori = valorMin + r.nextInt(valorMax - valorMin +1);
				resultatReal = resultatReal + valorAleatori;
				System.out.print(" + " +valorAleatori);
			}
			System.out.println(" = ");
			tempsInicial = System.currentTimeMillis();
			resultatUsuari = s.nextInt();
			tempsFinal = System.currentTimeMillis();
			tempsTranscorregut = (tempsFinal - tempsInicial) / 1000.0;
			if (resultatUsuari == resultatReal && tempsTranscorregut < tempsResposta ) {
				encerts = encerts +1;
			}
			else {
				System.out.print("Has fallat ");
			}
			if (tempsTranscorregut > tempsResposta && resultatUsuari == resultatReal) {
				errorsPerTemps = errorsPerTemps + 1;
				System.out.println("per que has respost tard.");
				
			}
			
		}
		s.close();
		System.out.println("");
		System.out.println("");
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("N'has encertat: " + encerts + " de " + nombreOperacions + ".");
		if (errorsPerTemps > 0 && errorsPerTemps != 1) {
			System.out.println("D'aquests errors, " + errorsPerTemps + " ha sigut per que has contestat un cop passat el límit de temps. ");
		}
		else if (errorsPerTemps == 1) {
			System.out.println("Aquest error ha sigut per que has contestat un cop passat el límit de temps.");
		}
		System.out.println("----------------------------------------------------------------------------------");
		
	}

}
