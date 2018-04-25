import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("./dades.txt"));
		int numEstacions = llegeixNombreEstacions(s);
	}
	/**
	 * Mètode que ens diu el nombre d'estacions sobre les quals tenim dades en l'arxiu
	 * CSV d'entrada.
	 * @param sc Objecte Scanner prèviament creat i associat a l'arxiu d'entrada. Se
	 * suposa que encara no s'hi ha fet cap lectura i, per tant, el primer
	 * que hi trobarem serà la línia que conté el nombre d'estacions.
	 * @return Nombre d'estacions meteorològiques especificades en la primera línia de l'arxiu
	 * d'entrada CSV. Si l'arxiu d'entrada no té el format correcte o bé, hem llegit
	 * prèviament alguna cosa de l'arxiu i per tant la propera lectura no donarà
	 * la primera línia, el mètode pot generar un error d'execució.
	 * @throws FileNotFoundException 
	 */
	 public static int llegeixNombreEstacions(Scanner sc) throws FileNotFoundException {
			String linia;
			linia = sc.nextLine();
			System.out.println(linia);
			return 0;
	 }
	
	 /**
	 * Mètode que llegeix les línies de l'arxiu que contenen dades sobre les estacions
	 * meteorològiques, n'extreu el nom, la temperatura i la humitat relativa, i guarda
	 * cada cosa dins la taula corresponent. Les taules que passem com a paràmetre són per
	 * permetre el retorn de valors (paràmetres de sortida) i han de tenir totes tres la
	 * mateixa mida (tantes posicions com línies de dades preveiem que tindrà el fitxer).
	 * @param sc Objecte Scanner prèviament creat i associat a l'arxiu d'entrada. Se
	 * suposa que d'aquest fitxer se n'ha llegit la primera línia, la que conté
	 * el nombre de línies i, per tant, hi trobarem només les línies que contenen
	 * les dades de les estacions meteorològiques.
	 * @param n Taula de noms, creada amb tantes posicions com preveiem que caldran.
	 * @param t Taula de temperatures, creada amb tantes posicions com preveiem que caldran.
	 * @param h Taula d'humitats, creada amb tantes posicions com preveiem que caldran.
	 * @return Valor de tipus enter que indica el nombre de línies de dades llegides. Com
	 * a molt, tindrà el mateix valor que el length de les taules. Si les dades
	 * s'acaben prematurament, retornarà un nombre de línies llegides menor que la
	 * mida de les taules.
	 */
	 public static int llegeixDadesArxiu(Scanner sc, String[] n, double[] t, double[] h) {
		 String linia;
		 int contadorComes = 0;
		 while (sc.hasNext() == true) {
				linia = sc.nextLine();
				for (int i = 0; i < linia.length(); i++) {
					if (linia.charAt(i) == ',') {
						contadorComes++;
					}
				}
					
			}
	 }
	
	
	
	 /**
	 * Mètode al qual li passem una cadena CSV i ens retorna l'element que li demanem,
	 * identificant l'element amb un nombre enter (1 és el primer element, 2 el segon, etc.).
	 * @param cadenaCSV
	  String que conté la cadena CSV de la qual en volem extreure
	 *
	  un element donat.
	 * @param elementAExtreure Nombre de l'element que volem extreure de la cadena CSV.
	 * @return
	  String amb l'element extret de la cadena CSV. Si l'element
	 *
	  demanat no existeix, ens retorna null.
	 */
	 public static String extreuElementCSV(String cadenaCSV, int elementAExtreure) {
		
		 String elementCSV;
		 int posicioInicialComa;
		 int comptadorComes = 0;
		 int posicioFinalComa;
		 //coma = elementAExtreure -1
		 //indexOF(",");
		 //charAt();
		 for (int i = 0; i < cadenaCSV.length(); i++) {
			if (cadenaCSV.charAt(i) == ',') {
				comptadorComes++;
				posicioInicialComa = cadenaCSV.indexOf(",");
				posicioFinalComa = cadenaCSV.indexOf(",", i+1);
				if (elementAExtreure == comptadorComes-1) {
					elementCSV = cadenaCSV.substring(posicioInicialComa, posicioFinalComa);
					break;
				}
			}
		}
		 return elementCSV;
	 }


}







































/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(new File("DadesTemps"));
		String linia;
		int suma=0;
		int valor;
		
		while (s.hasNext() == true) {
			linia = s.nextLine();
			System.out.println(linia);
			//valor = Integer.parseInt(linia);
			//suma = suma + valor;
		}
		
		System.out.println("Suma: " + suma);
		
		
	}

}*/