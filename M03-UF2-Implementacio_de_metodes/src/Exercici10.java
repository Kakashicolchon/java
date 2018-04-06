import java.util.Arrays;

public class Exercici10 {

	public static void main(String[] args) {
		int[] numeros = {3 ,4 ,5 ,6 ,8 ,9 ,11,13,22,25,26,36,43,50,57};
		int[] resultat;
		System.out.println(Arrays.toString(numeros));
	
		resultat = insercioOrdenada(numeros, 24);
		
		System.out.println(Arrays.toString(resultat));
		
	}
	
	public static int[] insercioOrdenada (int[] valors, int nou) {
		int posicio = valors.length;
		int i;
		boolean trobat = false;
		int[] resultat = new int[valors.length+1];
		//bucle per buscar en quina posició de la taula cal inserir
		//el nou valor per tal de no trencar l'ordre ascendent.
		i = 0;
		while ( i < valors.length && trobat == false) {
			if (nou < valors[i] ) {
				posicio = i;
				trobat = true;
			}
			i++;
		}
		//Copiarem tots els els elements de la taula d'entrada a la taula resultat, fins a la posició on ha d'anar el nou element.
		System.arraycopy(valors, 0, resultat, 0, posicio);
		//Copiar tots els elements de la taula d'entrada que han de quedar desplaçats per poder inserir els elements de forma ordenada 
		System.arraycopy(valors, posicio, resultat, posicio+1, valors.length-posicio);
		//Inserir el nou element a la posiio que toca
		resultat[posicio] = nou;
		
		return resultat;
				//Acabar el ejersisio
	}

}
