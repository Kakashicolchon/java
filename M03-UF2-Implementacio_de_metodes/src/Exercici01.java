import java.util.Arrays;

public class Exercici01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] notes = {7.5, 4.2, 9.8, 5.6, 9.2};
		
		System.out.println("Notes obtingudes: " + Arrays.toString(notes));
		System.out.println("Mitjana aritm�tica: " + calcularMitja(notes));

	}
	/**
	 * Funci� que calcula la mitja aritm�tica dels valors que cont� una taula unidimentsional.
	 * Si la taula que ens passen no t� cap element o no est� creada(val null), la funci� pot generar un error d'execuci�.
	 * @param valors Taula unidimensional de valors de tipus double.
	 * @return Valor de tipus double que cont� la mitja aritm�tica que s'ha de calculat.
	 */
	public static double calcularMitja (double[] valors) {
		double suma = 0;
		
		//Bucle que recorre els elements de la taula que ens passin com a par�metre, i elsva sumant.
		for (int i = 0; i < valors.length; i++) {
			suma = suma + valors [i];
		}
		return suma/ valors.length;
	}
}
