import java.util.Scanner;

public class Exercici8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paraula = "";
		String paraulaInvertida = "";
		Scanner s = new Scanner(System.in);
		
		//Mètode 1
		//Demanem
/*		
		
		System.out.print("Escriu una paraula: ");
		paraula = s.nextLine();
		
		//Executem
		paraulaInvertida = new StringBuilder(paraula).reverse().toString();
		System.out.println(paraulaInvertida);
*/		
		//Mètode 2
		//Demanem
		System.out.print("Escriu una paraula: ");
		paraula = s.nextLine();
		
		
		//Executem
		//Bucle que agafarà lletra a lletra la paraula que ens ha donat l'usuari i les afagirà a la variable paraulaInversa en l'ordre oposat.
		
		for (int i = 0; i < paraula.length(); i++) {
			paraulaInvertida = paraula.charAt(i) + paraulaInvertida;
			
		}
		//Comprovem si es equals
		
		if (paraula.equalsIgnoreCase(paraulaInvertida)) {
			System.out.println("La paraula és un palíndrom.");
		}
		else {
			System.out.println("No és un palíndrom.");
		}
		
	}

}
