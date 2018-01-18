import java.util.Scanner;

public class Exercici10 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String missatge;
		String missatgeEncriptat = "";
		String abcedari = "abcdefghijklmnopqrstuvwxyza";
		String lletraActual;
		int posicioLletra;
		//Demanem a l'usuari que ens doni el missatge per encriptar.
		
		System.out.print("Escriu el missatge per encriptar: ");
		missatge = s.nextLine().toLowerCase().replace(" ", "");
		
		
		//Bucle que recorre les lletres del missatge, una a una, i les va transformant.
		for (int i = 0; i < missatge.length(); i++) {
			
			lletraActual = missatge.substring(i, i+1);
			
			posicioLletra = abcedari.indexOf(lletraActual);
			
			missatgeEncriptat = missatgeEncriptat + abcedari.charAt(posicioLletra + 1);
		
		}
		System.out.println(missatgeEncriptat);
	}

}
