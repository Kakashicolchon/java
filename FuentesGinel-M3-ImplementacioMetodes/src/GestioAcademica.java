import java.util.Arrays;

public class GestioAcademica {

	public static void main(String[] args) {
		//--------------------------Declaraci� de Variables-----------------------------
		//Taula de notes d'exmeple
		double[] notes = {5.1, 1.6, 7.8, 4.2, 1.8, 9.3, 1.1, 6.3, 2.2, 5.2, 2.6, 6.0, 7.3, 8.1, 7.0};
		
		//variable on es guarda el marge de les notes 
		/*
		 * El marge entre la nota individual dels alumnes i 
		 * la mitja aritm�tica del grup a partir del qual
		 * s'aplicar� la bonifcaci� (es tracta d'un valor num�ric real).
		 */
		double marge = 1.5;

		/*
		 * La bonifcaci� (valor num�ric real que se sumar� a 
		 * la nota individual d'un alumne quan
		 * aquesta estigui per sobre de la mitja en una magnitud 
		 * que superi el marge especifcat).
		 */
		double bonif = 1.0; //tant marge com bonificaci� son dades externes

		//--------------------------Main-----------------------------
		
		//Agafem la taula resultant de la funcio bonificaNotes
		double [] resultat = bonificaNotes(notes, marge, bonif);
		//Imprimim per pantalla la taula amb les bonificacions pertinents
		System.out.println(Arrays.toString(resultat));
	}

	public static double[] bonificaNotes (double[] notes, double marge, double bonif) {
		double totalNotes = 0;
		double MitjaNotaGrup;
		double[] resultat = new double[notes.length];
		//Variable que indica desde quina nota es bonifica
		double NotaBonificada;
		
		//Contem la suma de totes les notes per a saber la mitja
		for (int i = 0; i < notes.length; i++) {
			totalNotes = totalNotes + notes[i];
		}
		//Fem la mitja
		MitjaNotaGrup = totalNotes/notes.length;
		//Nota >= per la que bonificarem
		NotaBonificada = MitjaNotaGrup + marge;
		for (int i = 0; i < notes.length; i++) {
			if (notes[i] >= NotaBonificada ) {
				if (notes[i] + bonif > 10) {
					resultat[i] = 10;
				}
				resultat[i] = notes[i]+bonif;
			}
			
		}
		
		return resultat;
	}
}
