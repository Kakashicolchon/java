import java.util.Scanner;

public class GestioCSV_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String cadenaDeCaracters; //Variable on s'emmagatzemarà la cadena que ens doni l'usuari
		String elementSeleccionat; //String on es guardarà l'element que ha sel·leccionat l'usuari
		int element; //Número d'element que vol extreure l'usuari
		int numeroElements = 0; //Número d'elements que te la cadena CSV
		int pf; //Punt final de l'element, necessari per poder extreure'l
		int coma = 0; //Numero de coma en la que ens trobem en cada moment del bucle, necessari per saber l'element que hem d'extreure.
		
		//Demanem la cadena
		System.out.print("Escriu una línia: ");
		cadenaDeCaracters = s.nextLine().trim();
		
		//Demanem quin element vol l'usuari
		System.out.print("Quin element vols? ");
		element = s.nextInt();
		
		//Per aconseguir que l'usuari no hagi de pensar que el primer element és el 0, fem aquest if
		if (element != 0) {
			element--;
		}
		
		
		//Contem la quantitat d'elements
		for (int i = 0; i < cadenaDeCaracters.length()-1; i++) {

			if (cadenaDeCaracters.charAt(i) == ',') {
				numeroElements++;
			}
		}
		numeroElements++;
		
		//Comprovem que no sigui negatiu i sigui com maxim la quantitat màxima d'elements. (Començem a contar desde 0, per que l'usuari obtingui el primer element, haurà de posar 0
		while (element < 0  || element > numeroElements-1) {
			System.out.println("L'element ha de ser entre 1 i " + numeroElements);
			System.out.print("Quin element vols? ");
			element = s.nextInt();
			if (element != 0) {
				element--;
			}
		}
		
		//En aquest punt sabem que l'element que vol l'usuari està disponible.
		
		for (int i = 0; i < cadenaDeCaracters.length()-1; i++) {
			//En cas de que l'element sel·leccionat sigui el primer.
			if (element == 0 && numeroElements != 1) {
				pf = cadenaDeCaracters.indexOf(',', i);
				elementSeleccionat = cadenaDeCaracters.substring(0, pf);
				System.out.print(elementSeleccionat.trim());
				break;
			}
			//En cas de que només hi hagi 1 element
			else if (numeroElements == 1) {
				cadenaDeCaracters.substring(0);
				System.out.println(cadenaDeCaracters.trim());
				i = cadenaDeCaracters.length()+1;
			}
			//En els demés casos.
			else if (element != 0 && cadenaDeCaracters.charAt(i) == ',') {
				coma++;
				if (coma == element && coma != (numeroElements-1)) {
					//i posicio primera coma, pf, segona coma
					pf = cadenaDeCaracters.indexOf(',', i+1);
					elementSeleccionat = cadenaDeCaracters.substring(i+1, pf);
					System.out.println(elementSeleccionat.trim());
					break;
				}
				else if(coma == element) {
					elementSeleccionat = cadenaDeCaracters.substring(i+1);
					System.out.println(elementSeleccionat.trim());
				}
			}
		}
		
		s.close();
	}

}
