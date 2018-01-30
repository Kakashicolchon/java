import java.util.Scanner;

public class Exercici12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s =new Scanner(System.in);
		String numHex;
		String numBin = "";
		String digitActual;
		int posDigitActual;
		String digitsHex = "0123456789ABCDEF";
		String digitsBin= "0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111";
		
		//Demanem a l'usuari un nombre hexadecimal.
		System.out.print("Escriu un nombre hexadecimal: ");
		numHex = s.nextLine().toUpperCase();
		
		//Recorren el nombre hexadecimal digit a digit
		for (int i = 0; i < numHex.length(); i++) {
			
			//Extraiem el digit actual del nombre
			digitActual = numHex.substring(i, i+1);
			
			//Mira la posicio on es troba el digit actual dins de digitsHex
			posDigitActual = digitsHex.indexOf(digitActual);
			
			numBin = numBin + digitsBin.substring(posDigitActual * 5, posDigitActual * 5 + 4);
		}
		
		//Aquest bucle elimina els pusibles 0 que ja devant i para quan troba el primer 1
		while(numBin.startsWith("0")) {
			numBin = numBin.substring(1);
		}
		
		
		System.out.println(numBin);
	}

}
