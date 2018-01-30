import java.util.Scanner;

public class GestioCSV_3Opcional {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cadenaDeCaracters; //Variable on s'emmagatzemarà la cadena que ens doni l'usuari
		String elementAlcada = "";
		String elementPes;
		String elementDades = "";
		boolean t = true;
		int coma = 0;
		int pf;
		int p = 0;

		//Demanem la cadena
		System.out.print("Escriu una línia: ");
		cadenaDeCaracters = s.nextLine().trim();

		for (int i = 0; i < cadenaDeCaracters.length()-1; i++) {
			if (cadenaDeCaracters.charAt(i) == ',') {
				coma++;
			}
			//Agafem les dades personals amb el format donat
			else if (coma == 2 && t == true) {
				pf = cadenaDeCaracters.indexOf(',', i+1);
				elementDades = cadenaDeCaracters.substring(0, pf);
				
				t = false;
			}
			//elementAlcada
			else if (coma == 3) {
				//i posicio primera coma, pf, segona coma
				pf = cadenaDeCaracters.indexOf(',', i+1);
				elementAlcada = cadenaDeCaracters.substring(i+1, pf);
				
				break;
			}
			p = i;
		}
			
			//Últim element.
			elementPes = cadenaDeCaracters.substring(p+8);
			

			//Transformem els strings a doubles
			double pes = Double.valueOf(elementPes).doubleValue();
			double alcada = Double.valueOf(elementAlcada).doubleValue();
			double imc = (double) Math.pow(alcada, 2);
			imc = pes/imc;
			System.out.printf(elementDades.toUpperCase().replace(" ", "") + "," + "%.2f", imc);
		s.close();
	}

}
