import java.util.Scanner;

public class Exercici9 {

	public static void main(String[] args) {
		String paraules;
		Scanner s = new Scanner(System.in);
		String resultat = "";
		int posicio = 0;
		boolean ultimaParaula = false;
		//Demanem la seq��ncia de paraules a l'usuari
		
		System.out.print("Itrodueix la seq��ncia de paraules: ");
		paraules = s.nextLine().trim();
		
		//Agafem la primera paraula.
		posicio = paraules.indexOf(" ");		
		
		//Comprovem si hi haia espais;
		if (posicio == -1) {
			//No hi havia cap espai, nom�s tenim una paraula.
			resultat = paraules.toLowerCase();
		}
		else {
			//+ d'una paraula, si hi ha espais posem la primera paraula el resultat i engeguem un bucle per trobar la resta de paraules.
			resultat = paraules.substring(0, posicio).toLowerCase();
			
			//Bucle que executar� el tractament de les paraulesa partir de la segona, fins que deixem de trobar espais.
			while (!paraules.isEmpty()) {
				//Busquem el seg�ent espai.
				posicio = paraules.indexOf(" ");
				
				//si no hi ha m�s espais agafarem desde la ultima posicio.
				if (posicio == -1) {
					posicio = paraules.length();
					ultimaParaula = true;
				}
				
				//Concatenem la primera lletra de la paraula al resulatat, passant-la a maj�scules.
				resultat = resultat + paraules.substring(0, 1).toUpperCase();
				
				//Concatenem la resta de la paraula al resultat, passant-la a min�scules.
				resultat = resultat + paraules.substring(1, posicio).toLowerCase();
				
				//eliminem la paraula que hem extret de la seq��ncia inicial.
				paraules = paraules.substring(posicio + 1);
				
				if (ultimaParaula == false) {
					//Eliminem la paraula que hem extret de la seq��ncia inicial.
					paraules = paraules.substring(posicio + 1);
					
				}
				else {
					paraules = "";
				}		
			}
		}
		System.out.print(resultat);
	}

}
