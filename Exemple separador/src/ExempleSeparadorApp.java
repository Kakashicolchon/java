import java.util.Scanner;

public class ExempleSeparadorApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String paraula;
		int posicio;
		
		//demanem la paraula a l'usuari
		System.out.print("Escriu una paraula: ");
		paraula = s.nextLine();
		
		//Bucle que recorri els caràcters de la paraula 1 a 1.
		for (int pos = 0; pos <= paraula.length()-1; pos++) {
			System.out.print(paraula.charAt(pos));
			if (pos != paraula.length()-1) {
				System.out.print("-");
			}
		}
		System.out.println("");
		
		//Mostrem els tres primers caràcters de la paraula.
		System.out.println("3 primers caràcters: " + paraula.substring(0, 3));
		
		//Comprovem si la paraula que ens hadonat l'usuari conté unasubcadena "ma".
		posicio = paraula.indexOf("ma");
		if (posicio == -1) {
			System.out.println("La paraula no conté 'ma'");
		}
		else {
			System.out.println("La paraula conté 'ma' i apareix per primer cop a la posició " + posicio);
		}

	}

}
