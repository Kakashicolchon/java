import java.util.Arrays;

public class Exercici01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notes = {7.5, 4.2, 9.8, 5.6, 9.2};
		
		System.out.println("Notes obtingudes: " + Arrays.toString(notes));
		System.out.println("Mitjana aritmètica: " + calcularMitja(notes));

	}
	/**
	 * Funció que calcula la mitja aritmètica dels valors que conté una taula unidimentsional.
	 * Si la taula que ens passen no té cap element o no està creada(val null), la funció pot generar un error d'execució.
	 * @param valors Taula unidimensional de valors de tipus double.
	 * @return Valor de tipus double que conté la mitja aritmètica que s'ha de calculat.
	 */
	public static double calcularMitja (double[] valors) {
		double suma = 0;
		
		//Bucle que recorre els elements de la taula que ens passin com a paràmetre, i elsva sumant.
		for (int i = 0; i < valors.length; i++) {
			suma = suma + valors [i];
		}
		return suma/ valors.length;
	}
}
