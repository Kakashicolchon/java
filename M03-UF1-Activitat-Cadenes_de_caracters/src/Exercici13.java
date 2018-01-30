import java.util.Scanner;

public class Exercici13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner s =new Scanner(System.in);
				String numHex = "";
				String numBin;
				String PaketActu;
				int posPaketActual;
				String digitsHex = "0123456789ABCDEF";
				String digitsBin= "0000 0001 0010 0011 0100 0101 0110 0111 1000 1001 1010 1011 1100 1101 1110 1111 ";
				
				//Demanem a l'usuari un nombre hexadecimal.
				System.out.print("Escriu un nombre binari: ");
				numBin = s.nextLine();
				
				//bucle que afegeix els zeros nequesaris al principi del nombre binari
				//per tal que tingui un numero de sigits multiple de 4 puges fer paquets exactes de 4 bits.
				while(numBin.length() % 4 != 0) {
					numBin = "0" + numBin;
				}
				
				//Recorren el nombre hexadecimal per paquets de 4 bits i comensan per el final
				for (int i = numBin.length()-4; i >= 0; i = i - 4) {
					
					//Extraiem el paquet de 4 bits actual del numero
					PaketActu = numBin.substring(i, i+4);
					
					//Mira la posicio on es troba el digit actual dins de digitsHex
					posPaketActual = digitsBin.indexOf(PaketActu);
					
					//Agafem el digit que toca de la cadena numeroHex, calculat a partir de la posicio del
					//posicio del paquet dividida entre 5.
					numHex =digitsHex.charAt(posPaketActual / 5)+ numHex;
				}
				
				//Aquest bucle elimina els pusibles 0 que ja devant i para quan troba el primer 1
				while(numBin.startsWith("0")) {
					numBin = numBin.substring(1);
				}
				
				
				System.out.println(numHex);

	}

}
