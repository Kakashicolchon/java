import java.util.Scanner;

public class GestioCSV_1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cadenaDeCaracters; //Variable on s'emmagatzemar� la cadena que ens doni l'usuari
		int elementsCSV = 0; //Numero d'elements CSV
		
		//Demanem la linea a l'usuari
		System.out.print("Escriu una l�nia: ");
		cadenaDeCaracters = s.nextLine().trim();
		
		//contem el n�mero d'elements
		for (int i = 0; i < cadenaDeCaracters.length()-1; i++) {
			
			if (cadenaDeCaracters.charAt(i) == ',') {
				elementsCSV++;
				}
			else {
				
			}
				
			
		}
		//Ensenyem el numero d'elements a l'usuari
		System.out.println(" ---> Numero d'unitats d'informaci� (Elements CSV): " + (elementsCSV+1));
		
		s.close();
	}

}
