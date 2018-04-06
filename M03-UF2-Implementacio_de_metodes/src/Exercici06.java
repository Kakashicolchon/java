import java.util.Arrays;

public class Exercici06 {

	public static void main(String[] args) {
		double[] notes = {7.5, 4.2, 9.8, 5.6, 1.2, 5.8};
		double[] resultat;
		System.out.println("Notes obtingudes:  " + Arrays.toString(notes));
		System.out.println("Posició nota màxima:  " + calcularPosicioMaxim(notes) +1 );
		
		//Cridem la funcio passant la taula i recollum la resultant
		resultat = posarMaximAlFinal(notes);
		//se ve modificada la tabla aun k haya pasado por una función
		System.out.println(Arrays.toString(resultat));
	}
	
	public static double[] posarMaximAlFinal(double[] numeros) {
		int posicioValorMaxim;
		double temporal;
		//creamos copia de la tabla parano modificar la original
		double[] resultat = new double[numeros.length]; //Creem la taula que utilitzarem per retornar com a resultat amb tants valors com la
													    //taula que ens donen com a paràmetre
		
		//fem la copia:
		
		System.arraycopy(numeros, 0, resultat, 0, numeros.length); //Desde numeros hasta resultat, ambas empezando en 0 y la longitud de la ultima sera la misma que la de numeros.
		
		//Esbrinem la posició on es troba el valor màxim de la taula "numeros".
		// aprofitem la funció prèviament desenvolupada a l'exercici 4.
		posicioValorMaxim = calcularPosicioMaxim(numeros);
		
		//Fem l'intercambi de valors entre la posició del màxim i la derrera posició de la taula fent una rotació que utilitza la variable temporal
		temporal = numeros[posicioValorMaxim];
		numeros[posicioValorMaxim] = numeros[numeros.length - 1];
		numeros[numeros.length - 1] = temporal;
		//retornem la taula modificada.
		return resultat;
	}
	
	public static int calcularPosicioMaxim (double[] valors) {
		double valorMaxim;
		int posicioMaxim;
		//exercici11
		valorMaxim = valors[0];
		posicioMaxim = 0;
		
		for (int i = 0; i < valors.length; i++) {
			if (valors[i] > valorMaxim) {
				valorMaxim = valors[i];
				posicioMaxim = i;
			}
		}
		return posicioMaxim;
	}
	

}
