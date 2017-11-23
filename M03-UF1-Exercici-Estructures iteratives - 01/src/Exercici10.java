import java.util.Scanner;

public class Exercici10 {

	public static void main(String[] args) {
		int amplada = 0, altura = 0;
		int contador = 0, contador2 = 0;
		Scanner s = new Scanner(System.in);
		
		while (contador == 0) {
			//Pedimos altura
			System.out.print("Digues una altura: ");
			altura= s.nextInt();
			if (altura <= 10 && altura > 0) {
				contador = 1;
				}
			else {
				System.out.println("No has introduït un número entre 1 y 10");
			}
		}
			
		while (contador2 == 0) {
			//Pedimos anchura
			System.out.print("Digues una amplada: ");
			amplada = s.nextInt();
			if (amplada <= 40 && amplada > 0) {
				contador2 = 1;
			}
			else {
				System.out.println("No has introduït un número entre 1 i 40");
		}
		}
		s.close();
		
		//Ejercicio
		System.out.println("");
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < amplada; j++) {
				System.out.print("*");
				}
			System.out.println("");
		}

		
		}
		
		
	}
