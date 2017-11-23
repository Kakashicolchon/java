import java.util.Scanner;

public class Exercici3 {

	public static void main(String[] args) {
		int valor = 0;
		int suma = 0;
		double mitja = 0;
		int quantsValors= 0;
		Scanner s = new Scanner(System.in);
		//demanem el valor a l'usuari
		System.out.println("Introdueix la quantitat de valors que donaràs: ");
		s.nextInt();
		while (valor != -1) {
			System.out.print("Introdueix un nou valor a la suma (-1 per acabar): ");
			valor= s.nextInt();
			//operació entre els valors fins que l'usuari volgui sortir
			if (valor != -1) {
				suma = suma + valor;
				quantsValors++;
			}
		}
		mitja= (double)suma / quantsValors;
		
		System.out.printf("La mitjana aritmètica és: %.2f", mitja);
		s.close();
	}

}
