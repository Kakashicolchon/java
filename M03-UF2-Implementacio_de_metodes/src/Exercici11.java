import java.util.Arrays;

public class Exercici11 {

	public static void main(String[] args) {
		int[] numeros = {3, 4, 5, 6, 8, 9, 11, 13, 22, 25, 26, 36, 43, 50, 57};
		int[] resultat;
		System.out.println(Arrays.toString(numeros));
	
		resultat = eliminarElement(numeros, 7);
		
		System.out.println(Arrays.toString(resultat));
		
	}
	public static int[] eliminarElement (int[] valors, int posicio) {
		int[] resultat = new int[valors.length-1];
		//Copiem tots els elements de la taula d'entrada a la taula del resultat, fins just abans de l'element que volem eliminar.
		System.arraycopy(valors, 0, resultat, 0, posicio);
		//Copiar tots els elements de la taula d'entrada, a la taula del resultat, a partir de l'element següent del que volem eliminar,
		//desplaçant-los 
		System.arraycopy(valors, posicio+1, resultat, posicio, valors.length-1-posicio);
		return resultat;
	}

}
