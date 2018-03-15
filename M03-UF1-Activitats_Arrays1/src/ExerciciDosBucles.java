
public class ExerciciDosBucles {

	public static void main(String[] args) {
		String [][] noms = {
				{"Josep","Joan","Maria", "Pere"},
				{"Ramon", "Eva", "Rosa" , "Pep"},
				{"David", "Francesc", "Olga", "Lidia"}
		};

		//Fem el recorregut el recorregut primer per files i després per columnes.
		for (int f = 0; f < noms.length; f++) {
			for (int c = 0; c < noms[f].length; c++) {
				System.out.println("[" + f + "] [" + c + "]" + noms[f][c]);
			}
		}

		System.out.println("SDAfghjkhgfdsadfghjkhgfd5555555555555555555555555555555555");
		//Fem el recorregut el recorregut primer per columnes i després per files (només funciona si es regular.
		for (int c = 0; c < noms[0].length; c++) {
			for (int f = 0; f < noms.length; f++) {
				System.out.println("[" + f + "] [" + c + "]" + noms[f][c]);
			}
		}
			
		}
	}
