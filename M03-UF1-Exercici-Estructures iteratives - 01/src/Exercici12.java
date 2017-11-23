import java.util.Random;

public class Exercici12 {

	public static void main(String[] args) {
		int longitud;
		char caracter;
		Random r = new Random(System.currentTimeMillis());
		
		/* hacemos un next int de un intervalo de 2 a 15   (con el "14", generamos uno de 0...13 y añadiendole un+2 al final
		 * se convierte en uno de 2 a 15
		 * luego ponemos el valor del random en longitud
		 */
		longitud = r.nextInt(14)+2;
		
		for (int i = 1; i <= longitud; i++) {
			//generem un caràcter a l'atzar entre 'a'i 'z'.
			caracter = (char)('a' + r.nextInt(26));
			System.out.print(caracter);
		}
	}

}
