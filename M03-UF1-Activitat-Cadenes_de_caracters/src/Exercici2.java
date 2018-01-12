import java.util.Scanner;

public class Exercici2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String nomComplet = "";
		String inicials = "";
		int posicio;
		System.out.print("Nom + cognoms: ");
		nomComplet = s.nextLine();
		
		//Treiem la incial del nom
		inicials = inicials + nomComplet.charAt(0);
		
		//Triem la inicial del 1r Cognom.
		posicio = nomComplet.indexOf(" ");
		inicials = inicials + nomComplet.charAt(posicio+1);
		posicio = nomComplet.lastIndexOf(" ");
		inicials = inicials + nomComplet.charAt(posicio+1);
		
		//mostrem
		System.out.println(inicials.toUpperCase());
		
	}

}
