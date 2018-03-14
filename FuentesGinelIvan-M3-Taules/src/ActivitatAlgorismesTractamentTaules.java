import java.util.Scanner;

public class ActivitatAlgorismesTractamentTaules {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //Creamos un Scanner para pedir al usuario los datos
		String stringFila = ""; // String donde guardaremos la concatenación de carácteres
		String palabraIsReversed; //String que haremos servir para determinar si la palabra
								  // que nos dió el usuario está invertida o no
		String palabraABuscar; //Palabra a buscar en la sopa de letras.
		String palabraABuscarInvertida = ""; //Palabra a buscar(invertida) en la sopa de letras.
		Boolean palabraEncontrada = false;
		String verticalOHoritzontal = "";
		//Taula prefeta de l'exemple
		String [][] sopaDeLletres = {
				{"X", "F", "E", "K", "J", "U", "I", "R", "S", "H"},
				{"Z", "H", "S", "W", "E", "R", "T", "G", "O", "T"},
				{"B", "R", "A", "B", "F", "B", "P", "M", "V", "U"},
				{"D", "W", "E", "R", "O", "O", "J", "L", "L", "W"},
				{"U", "T", "O", "N", "I", "R", "O", "B", "C", "R"}, //BORINOT AL REVES
				{"O", "P", "R", "O", "V", "I", "I", "K", "V", "B"},
				{"N", "I", "Q", "U", "E", "N", "T", "N", "S", "A"},
				{"O", "V", "U", "L", "R", "O", "S", "S", "O", "T"},
				{"A", "S", "A", "X", "J", "T", "R", "R", "I", "T"},
				{"R", "K", "M", "E", "P", "U", "B", "O", "T", "A"},
				{"B", "O", "R", "I", "N", "O", "T", "O", "Y", "L"}, //BORINOT AÑADIDA 
				
		};
		
		// Preguntamos la palabra que el usuario quiere buscar
		// y la ponemos en mayusculas por si el usuario no lo hace
		System.out.print("Quina paraula se't resisteix?   :  ");
		palabraABuscar = s.nextLine().trim().toUpperCase();
		
		
		// Preguntamos si quiere buscarla verticalment u horizontalmente
		System.out.print("Com vols buscar la paraula horitzontalment='H' o verticalment='V' ?  : ");
		verticalOHoritzontal = s.nextLine().trim().toUpperCase();
		
		
		//Preguntamos al usuario si la palabra que va a buscar está invertida
		System.out.print("Està invertida? Si='S' No='N'     :  ");
		palabraIsReversed = s.nextLine().toUpperCase().trim();
		if (palabraIsReversed.contains("S")) {//Si la palabra está al revés en la sopa de letras le damos la vuelta con un for.
			for (int i = palabraABuscar.length()-1; i >= 0; i--) {
				palabraABuscarInvertida = palabraABuscarInvertida + palabraABuscar.charAt(i);
			}
		}
		
		
		
		if (verticalOHoritzontal.contains("H")) {
			//RECORRIDO POR FILAS  Comenzamos el proceso de busqueda con un recorrido por la tabla 
			for (int f = 0; f < sopaDeLletres.length; f++) {
				for (int c = 0; c < sopaDeLletres[f].length; c++) {
					stringFila = stringFila + sopaDeLletres[f][c];
				}
				
				//Una vez hecha la pasada por toda la fila, la analizamos 
				if (stringFila.contains(palabraABuscarInvertida) && palabraIsReversed.contains("S") ) { 
					//Si la palabra está revertida entrará en este if
						System.out.println("La sopa de lletres conté la paraula  '" + palabraABuscar + "' a la fila " + (f+1));
						palabraEncontrada = true;
				    
				}
				
				else if (stringFila.contains(palabraABuscar) && palabraIsReversed.contains("N") ){ //DONE
					//Si la palabra no está invertida entrará en este otro
					System.out.println("La sopa de lletres conté la paraula '" + palabraABuscar + "' a la fila " + (f+1));
					palabraEncontrada = true;
				}
				else { //si no entró en ninguno de los 2 ifs, el string se borrará para poder poner
					   //los carácteres de la siguiente fila
					stringFila = "";
				}
				
				if (palabraEncontrada == true) {
					f = sopaDeLletres.length;
				}

			}
		}
		else {
			//RECORRIDO POR COLUMNAS  Comenzamos el proceso de busqueda con un recorrido por la tabla 
			for (int c = 0; c < sopaDeLletres[0].length; c++) {
				for (int f = 0; f < sopaDeLletres.length; f++) {
					stringFila = stringFila + sopaDeLletres[f][c];
				}
				//Una vez hecha la pasada por toda la fila, la analizamos 
				if (stringFila.contains(palabraABuscarInvertida) && palabraIsReversed.contains("S") ) { 
					//Si la palabra está revertida entrará en este if
						System.out.println("La sopa de lletres conté la paraula  '" + palabraABuscar + "' a la columna " + (c+1));
						palabraEncontrada = true;
				    
				}
				
				else if (stringFila.contains(palabraABuscar) && palabraIsReversed.contains("N") ){ //DONE
					//Si la palabra no está invertida entrará en este otro
					System.out.println("La sopa de lletres conté la paraula '" + palabraABuscar + "' a la columna " + (c+1));
					palabraEncontrada = true;
				}
				else { //si no entró en ninguno de los 2 ifs, el string se borrará para poder poner
					   //los carácteres de la siguiente fila
					stringFila = "";
				}
				
				if (palabraEncontrada == true) { //Si se encuentra la palabra parará el bucle exterior
												 //Haciendo que la variable del for no valga y así no vuelva a entrar.
					c = sopaDeLletres.length;
				}
			}
		}
		if (palabraEncontrada == false) { //Si no se ha encontrado la palabra, informamos al usuario
			System.out.println("La praula no existeix dins la sopa de lletres o no s'ha escrit correctament.");
		}
	}
}
