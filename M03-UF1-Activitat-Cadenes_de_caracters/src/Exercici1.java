import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		String nom;
		String cognom1;
		String cognom2;
		Scanner s = new Scanner(System.in);
		String inicials = "";
		
		//Preguntem nom i cognoms a l'usuari.
		System.out.print("Nom: ");
		nom = s.nextLine().trim();
		System.out.print("Primer cognom: ");
		cognom1 = s.nextLine().trim();
		System.out.print("Segon cognom: ");
		cognom2 = s.nextLine().trim();
		
		//Agafem la primera lletra del nom i la concatenem amb la inicial.
		
		inicials = inicials + nom.charAt(0);
		inicials = inicials + cognom1.charAt(0);
		inicials = inicials + cognom2.charAt(0);
		
		System.out.println("Inicials: " + inicials.toUpperCase());
	}

}
