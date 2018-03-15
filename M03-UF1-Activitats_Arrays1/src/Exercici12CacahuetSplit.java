
public class Exercici12CacahuetSplit {

	public static void main(String[] args) {
		String frase = "Si un cacauet cau en una piscina deixarà de ser un fruit sec";
		String[] paraules;
		
		//Amb split, "tranquem " la frase per cada punt on apareix un expai.
		paraules = frase.split(" ");
		
		//Recorrem la taula paraules, des del final cap a l'inici.
		for (int i = paraules.length - 1; i >= 0; i--) {
			System.out.print(paraules[i] + " ");
		}
		
	}

}
