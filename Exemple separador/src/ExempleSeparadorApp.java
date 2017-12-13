import java.util.Scanner;

public class ExempleSeparadorApp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String paraula;
		
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

	}

}
