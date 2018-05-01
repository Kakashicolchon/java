import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./dades.txt")); //Declarem l'Scanner que llegeix l'arxiu de dades de l'estació meteorològica
		int numEstacions; //Número d'estacions (línies) que té l'arxiu
		numEstacions = llegeixNombreEstacions(sc); //executem la funcio llegeixNombreEstacions per que ens retorni el número d'estacions que s'han de llegir
		double [] t = new double[numEstacions]; //Taula t que guarda els valors de les temperatures recollides
		double [] h = new double [numEstacions];//Taula h que guarda els valors de l'humitat recollida.
		double [] indexXafogorResultat = new double[numEstacions]; //Taula que guarda els resultats de calcular l'índex de xafogor
		String [] n = new String[numEstacions]; //Variable n que guarda el nom de les estacions.

		llegeixDadesArxiu(sc, n, t, h); //Executem la funció per omplir les taules n, t i h i poder-les utilitzar més andavant.

		indexXafogorResultat = calculaNIndexsXafogor(t, h); //Calculem tots els indexos i les guardem a la taula.
		//Fem un bucle for per ensenyar els resultats un per un.
		for (int j = 0; j < n.length; j++) {
			System.out.println(n[j] + " - " + (indexXafogorResultat[j]));
		}

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
		// Declarem la variable String cadenaCSV, que és el número d'estació.
		String cadenaCSV;
		// Amb el nextLine llegim la següent linea.
		cadenaCSV = sc.nextLine();
		// Passem a la variable nombreEstacions, la cadenaCSV passada a format Int.
		int nombreEstacions = Integer.parseInt(cadenaCSV);
		return nombreEstacions;
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
	public static int llegeixDadesArxiu(Scanner sc, String [] n, double[] t, double[] h) {
		// Declarem les variables cadenaCSV, nomEstacio, comptador.
		String cadenaCSV = "";
		int comptador = 0;
		// Fem un bucle per a cada linea del archiu .txt.
		while (sc.hasNext() == true) {
			cadenaCSV = sc.nextLine();
			n [comptador] = extreuElementCSV(cadenaCSV, 1);
			t [comptador] = Double.parseDouble(extreuElementCSV(cadenaCSV, 7));
			h [comptador] = Double.parseDouble(extreuElementCSV(cadenaCSV, 8));
			comptador++;
		}
		return comptador + 1;
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
		// Declarem una taula d'Strings que separi les dades per ",".
		String[] elements = cadenaCSV.split(",");
		elementAExtreure = elementAExtreure -1; 

		if (elements[elementAExtreure] == null) {
			return null;
		}
		else {
			return elements[elementAExtreure];
		}

	}


	/**
	 * Mètode que calcula un índex de xafogor a partir d'una temperatura expressada en
	 * graus centígrads i d'una humitat relativa expressada en percentatge.
	 * @param t Valor de la temperatura.
	 * @param h Valor de la humitat relativa.
	 * @return Índex de xafogor calculat.
	 */
	public static double calculaIndexXafogor(double t, double h) {
		// Declarem les variables indexXafogor i pow1 en format double.
		Double indexXafogor;
		Double pow1;

		// Utilitzem un pow per fer la potència de la operació.
		pow1 = Math.pow(10, ((7.5*t)/(237.7 + t)));
		// Guardem en la variable indexXafogor la formula de la operació.
		indexXafogor = t+(5/9)*((6.122*(h/100)*pow1)-10);


		return indexXafogor;
	}

	/**
	 * Mètode que calcula tots els índexs de xafogor, per a totes les estacions meteorològiques,
	 * a partir de les taules de temperatura i humitat. S'espera que les dues taules d'entrada
	 * tinguin la mateixa mida.
	 * @param ts Taula de temperatures (expressades en graus centígrads).
	 * @param hs Taula d'humitats relatives (expressades en tant per cent).
	 * @return Taula de tants elements com les dues taules d'entrada que conté
	 * els índexs de xafogor calculats.
	 */
	public static double[] calculaNIndexsXafogor(double[] ts, double[] hs) {
		//Declarem e inicialitzem una taula amb la mida de la taula ts on guardarem els resultats.
		double[] indexsXafogorCalculats = new double[ts.length];
		//Bucle crida la funció calculaIndexXafogor i posa el resultat en cada element de la taula indexsXafogorCalculats.
		for (int i = 0; i < indexsXafogorCalculats.length; i++) {
			indexsXafogorCalculats[i] = calculaIndexXafogor (ts[i],hs[i]);
		}

		return indexsXafogorCalculats;
	}




}
