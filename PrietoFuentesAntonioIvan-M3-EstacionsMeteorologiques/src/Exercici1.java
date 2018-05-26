import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("./dades.txt")); //Declarem l'Scanner que llegeix l'arxiu de dades de l'estaci� meteorol�gica
		int numEstacions; //N�mero d'estacions (l�nies) que t� l'arxiu
		numEstacions = llegeixNombreEstacions(sc); //executem la funcio llegeixNombreEstacions per que ens retorni el n�mero d'estacions que s'han de llegir
		double [] t = new double[numEstacions]; //Taula t que guarda els valors de les temperatures recollides
		double [] h = new double [numEstacions];//Taula h que guarda els valors de l'humitat recollida.
		double [] indexXafogorResultat = new double[numEstacions]; //Taula que guarda els resultats de calcular l'�ndex de xafogor
		String [] n = new String[numEstacions]; //Variable n que guarda el nom de les estacions.

		llegeixDadesArxiu(sc, n, t, h); //Executem la funci� per omplir les taules n, t i h i poder-les utilitzar m�s andavant.

		indexXafogorResultat = calculaNIndexsXafogor(t, h); //Calculem tots els indexos i les guardem a la taula.
		//Fem un bucle for per ensenyar els resultats un per un.
		for (int j = 0; j < n.length; j++) {
			System.out.println(n[j] + " - " + (indexXafogorResultat[j]));
		}

	}

	/**
	 * M�tode que ens diu el nombre d'estacions sobre les quals tenim dades en l'arxiu
	 * CSV d'entrada.
	 * @param sc Objecte Scanner pr�viament creat i associat a l'arxiu d'entrada. Se
	 * suposa que encara no s'hi ha fet cap lectura i, per tant, el primer
	 * que hi trobarem ser� la l�nia que cont� el nombre d'estacions.
	 * @return Nombre d'estacions meteorol�giques especificades en la primera l�nia de l'arxiu
	 * d'entrada CSV. Si l'arxiu d'entrada no t� el format correcte o b�, hem llegit
	 * pr�viament alguna cosa de l'arxiu i per tant la propera lectura no donar�
	 * la primera l�nia, el m�tode pot generar un error d'execuci�.
	 * @throws FileNotFoundException 
	 */
	public static int llegeixNombreEstacions(Scanner sc) throws FileNotFoundException {
		// Declarem la variable String cadenaCSV, que �s el n�mero d'estaci�.
		String cadenaCSV;
		// Amb el nextLine llegim la seg�ent linea.
		cadenaCSV = sc.nextLine();
		// Passem a la variable nombreEstacions, la cadenaCSV passada a format Int.
		int nombreEstacions = Integer.parseInt(cadenaCSV);
		return nombreEstacions;
	}

	/**
	 * M�tode que llegeix les l�nies de l'arxiu que contenen dades sobre les estacions
	 * meteorol�giques, n'extreu el nom, la temperatura i la humitat relativa, i guarda
	 * cada cosa dins la taula corresponent. Les taules que passem com a par�metre s�n per
	 * permetre el retorn de valors (par�metres de sortida) i han de tenir totes tres la
	 * mateixa mida (tantes posicions com l�nies de dades preveiem que tindr� el fitxer).
	 * @param sc Objecte Scanner pr�viament creat i associat a l'arxiu d'entrada. Se
	 * suposa que d'aquest fitxer se n'ha llegit la primera l�nia, la que cont�
	 * el nombre de l�nies i, per tant, hi trobarem nom�s les l�nies que contenen
	 * les dades de les estacions meteorol�giques.
	 * @param n Taula de noms, creada amb tantes posicions com preveiem que caldran.
	 * @param t Taula de temperatures, creada amb tantes posicions com preveiem que caldran.
	 * @param h Taula d'humitats, creada amb tantes posicions com preveiem que caldran.
	 * @return Valor de tipus enter que indica el nombre de l�nies de dades llegides. Com
	 * a molt, tindr� el mateix valor que el length de les taules. Si les dades
	 * s'acaben prematurament, retornar� un nombre de l�nies llegides menor que la
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
	 * M�tode al qual li passem una cadena CSV i ens retorna l'element que li demanem,
	 * identificant l'element amb un nombre enter (1 �s el primer element, 2 el segon, etc.).
	 * @param cadenaCSV
	  String que cont� la cadena CSV de la qual en volem extreure
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
	 * M�tode que calcula un �ndex de xafogor a partir d'una temperatura expressada en
	 * graus cent�grads i d'una humitat relativa expressada en percentatge.
	 * @param t Valor de la temperatura.
	 * @param h Valor de la humitat relativa.
	 * @return �ndex de xafogor calculat.
	 */
	public static double calculaIndexXafogor(double t, double h) {
		// Declarem les variables indexXafogor i pow1 en format double.
		Double indexXafogor;
		Double pow1;

		// Utilitzem un pow per fer la pot�ncia de la operaci�.
		pow1 = Math.pow(10, ((7.5*t)/(237.7 + t)));
		// Guardem en la variable indexXafogor la formula de la operaci�.
		indexXafogor = t+(5/9)*((6.122*(h/100)*pow1)-10);


		return indexXafogor;
	}

	/**
	 * M�tode que calcula tots els �ndexs de xafogor, per a totes les estacions meteorol�giques,
	 * a partir de les taules de temperatura i humitat. S'espera que les dues taules d'entrada
	 * tinguin la mateixa mida.
	 * @param ts Taula de temperatures (expressades en graus cent�grads).
	 * @param hs Taula d'humitats relatives (expressades en tant per cent).
	 * @return Taula de tants elements com les dues taules d'entrada que cont�
	 * els �ndexs de xafogor calculats.
	 */
	public static double[] calculaNIndexsXafogor(double[] ts, double[] hs) {
		//Declarem e inicialitzem una taula amb la mida de la taula ts on guardarem els resultats.
		double[] indexsXafogorCalculats = new double[ts.length];
		//Bucle crida la funci� calculaIndexXafogor i posa el resultat en cada element de la taula indexsXafogorCalculats.
		for (int i = 0; i < indexsXafogorCalculats.length; i++) {
			indexsXafogorCalculats[i] = calculaIndexXafogor (ts[i],hs[i]);
		}

		return indexsXafogorCalculats;
	}




}
