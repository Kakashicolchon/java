import java.util.Scanner;

public class Exercici02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Introdueix l'exponent");
		int base = s.nextInt();
		System.out.print("Introdueix la base");
		int exponent = s.nextInt();
		
		System.out.println("4 a la 3: " + potencia(base, exponent));
	} 
	/**
	 * Funci� que calcula pot�ncies de nombres enters, amb 
	 * exponents enters m�s grans o iguals a 0.
	 * @param base Par�metre de tipus int per on passarem el
	 * 		  valor de la base de la pot�ncia que volem calcular.
	 * @param exponent Par�metre de tipus int per on passarem el 
	 * 				   valor de l'exponent de la pot�ncia que volem calcular.
	 * @return Valor de tipus long, amb el resultat d'elevar la base a l'exponent.
	 */
	public static long potencia (int base, int exponent) {
		long resultat;
		resultat = 1;
		
		while (exponent > 0) {
			resultat = resultat * base;
			exponent = exponent - 1;
			
		}
		return resultat;
		
	}

}
