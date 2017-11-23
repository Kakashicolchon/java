import java.util.Scanner;

public class Exercici2 {

	public static void main(String[] args) {
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
		
		if ((valor1+valor2) == valor3) {
			System.out.println("Casualment el valor "+valor1+" + el valor "+valor2+" dona igual al valor "+ valor3+".");
		}
		else if ((valor2+valor3) == valor1) {
			System.out.println("Casualment el valor "+valor2+" + el valor "+valor3+" dona igual al valor "+ valor1+".");
		}
		else if ((valor3+valor1) == valor2) {
			System.out.println("Casualment el valor "+valor3+" + el valor "+valor1+" dona igual al valor "+ valor2+".");
		}
		else {
			System.out.println("La suma entre 2 valors no dona el tercer");
		}	
		s.close();
		
		}

	}
