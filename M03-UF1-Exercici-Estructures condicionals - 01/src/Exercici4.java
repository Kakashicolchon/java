import java.awt.print.Printable;
import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		//Exercici 4 nigguh
		int valor1;
		int valor2;
		int valor3;
		Scanner s = new Scanner(System.in);
		System.out.print("Digues el valor 1: ");
		valor1 = s.nextInt();
		System.out.print("Digues el valor 2: ");
		valor2 = s.nextInt();
		System.out.print("Digues el valor 3: ");
		valor3 = s.nextInt();
		//hem demanat els valors a l'usuari
		if ((valor3>valor2 && valor2>valor1) || (valor1>valor2 && valor2>valor3)) {
			System.out.println("Els números intrduïts estàn ordenats");
		}
		else {
			System.out.println("Els números intruduïts no estan ordenats");
		}

	}
	

}
