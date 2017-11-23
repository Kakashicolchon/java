import java.util.Scanner;

public class Exercici5 {

	public static void main(String[] args) {
		double alumnestotal;
		Scanner s = new Scanner(System.in);
		System.out.print("Digues el nombre d'alumnes a classe: ");
		alumnestotal = s.nextFloat();
		if (alumnestotal>0) {
			if (alumnestotal%2 == 0) {
				alumnestotal = alumnestotal/2;
				System.out.println("El numero de grups que es podran fer es: "+alumnestotal+".");
			}
			else if (alumnestotal%3 == 0) {
				alumnestotal = alumnestotal/3;
				System.out.println("El numero de grups que es podran fer es: "+alumnestotal+".");
			}
			else if (alumnestotal%2 < 0) {
				alumnestotal = alumnestotal/2 +1;
				System.out.println("El numero de grups que es poden fer es: "+alumnestotal+".");
			}
		}
		else {
			System.out.println("El numero que has introduït no es un enter positiu");
			
		}
		s.close();

		//hem demanat els valors a l'usuari

	}

}
