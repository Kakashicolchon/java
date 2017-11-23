import java.util.Scanner;

public class EntradaValors {

	public static void main(String[] args) {
		int valor1;
		int valor2;
		long resultat;
		Scanner willy= new Scanner(System.in);
		System.out.print("Introdueix el 1r valor: ");
		valor1=willy.nextInt();
				
		System.out.print("Introdueix el 2n valor: ");
		valor2=willy.nextInt();
		
		resultat = valor1 + valor2;
		
		System.out.println("El resultat és: " + resultat);
		
		willy.close();
	}

}
