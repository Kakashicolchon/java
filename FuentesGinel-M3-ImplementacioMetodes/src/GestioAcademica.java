import java.util.Arrays;

public class GestioAcademica {

	public static void main(String[] args) {
		//--------------------------Declaraci� de Variables-----------------------------
		//Taula de notes d'exmeple
		//double[] notes = null;
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
		double bonif = 2; //tant marge com bonificaci� son dades externes

		
		
		
		
		
		//--------------------------Main-----------------------------
		if (notes != null) {
			//Agafem la taula resultant de la funcio bonificaNotes
			double [] resultat = bonificaNotes(notes, marge, bonif);
			//Imprimim per pantalla la taula amb les bonificacions pertinents
			System.out.println(Arrays.toString(resultat));
			//Imprimir notas, margen bonificaci�n y luego resultado.
			
		}
		else {
			System.out.println("La taula �s nula.");
		}
		
		
	}

	
	
	
	/**
	 * Funci� que s'encarrega d'atrav�s dels par�metres mostrats a continuaci�, fer una mitjana amb totes
	 * les notes donades de la taula i tamb� s'encarrega de bonificar-les.
	 * En el cas de que s'entregui una taula null, no podr� executar-se la funci�, ha d'estar controlada
	 * abans d'entrar.
	 * [Controlat el cas en que s'apliqui la bonificaci� i la suma don�s m�s de 10, nota definitiva = 10]
	 * @param notes taula de tipus double que cont� les diferents notes
	 * @param marge variable de tipus double que cont� el marge donat per l'usuari
	 * @param bonif variable de tipus double que cont� la bonificaci� donada per l'usuari.
	 * @return taula de tipus double que retorna un array de la longitud de la taula notes contenint
	 * la taula amb les notes bonificades(en el cas de que sigui necesari)
	 */
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
				resultat[i] = notes[i]+bonif;
			}
			else {
				resultat[i] = notes[i];
			}
			//En el cas que la nota bonificada superi el 10, es posar� a 10.
			if (notes[i] + bonif > 10) {
				resultat[i] = 10;
			}
			
		}
		
		return resultat;
	}
}
