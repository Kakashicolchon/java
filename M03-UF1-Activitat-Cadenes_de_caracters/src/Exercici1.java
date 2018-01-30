import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) {
		String nom;
		String cognom1;
		String cognom2 = "";
		Scanner s = new Scanner(System.in);
		String inicials = "";
		
		//Condicionals per comprovar si l'string és buit o no.
		
		System.out.print("Nom: ");
		nom = s.nextLine().trim();
		System.out.print("Primer cognom: ");
		cognom1 = s.nextLine().trim();
		System.out.print("Segon cognom: ");
		cognom2 = s.nextLine().trim();
		
		if (nom.isEmpty() || cognom1.isEmpty()) {
			System.out.println("El nom i el primer cognom no es poden deixar en blanc.");
			System.out.print("Nom: ");
			nom = s.nextLine().trim();
			System.out.print("Primer cognom: ");
			cognom1 = s.nextLine().trim();
		}
		
		
		
		//Agafem la primera lletra del nom i la concatenem amb la inicial.
		
		inicials = inicials + nom.charAt(0);
		inicials = inicials + cognom1.charAt(0);
		if (cognom2.isEmpty()) {
			System.out.println("Inicials: " + inicials.toUpperCase());
		}
		else {
			inicials = inicials + cognom2.charAt(0);
			System.out.println("Inicials: " + inicials.toUpperCase());
		}
		s.close();
	}
	

}
