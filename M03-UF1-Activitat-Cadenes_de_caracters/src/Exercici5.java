import java.util.Scanner;

public class Exercici5 {

	public static void main(String[] args) {
		String paraula;
		Scanner s = new Scanner(System.in);
		
		//Demanem una paraula a l'usuari
		System.out.print("Escriu una paraula: ");
		paraula = s.nextLine().trim();
		
		//Comprovem si la paraula cont� "bori".
		if (paraula.contains("bori")) {
			// Si cont� "bori", eliminem aquesta seq��ncia de la paraula.
			paraula = paraula.replace( "bori", "");
			System.out.println("La paraula sense 'bori' �s: " + paraula);
		}
		else {
			System.out.println("La paraula no cont� 'bori'.");
		}
	}

}
