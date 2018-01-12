import java.util.Scanner;

public class Exercici5 {

	public static void main(String[] args) {
		String paraula;
		Scanner s = new Scanner(System.in);
		
		//Demanem una paraula a l'usuari
		System.out.print("Escriu una paraula: ");
		paraula = s.nextLine().trim();
		
		//Comprovem si la paraula conté "bori".
		if (paraula.contains("bori")) {
			// Si conté "bori", eliminem aquesta seqüència de la paraula.
			paraula = paraula.replace( "bori", "");
			System.out.println("La paraula sense 'bori' és: " + paraula);
		}
		else {
			System.out.println("La paraula no conté 'bori'.");
		}
	}

}
