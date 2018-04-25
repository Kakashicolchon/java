
public class pruebas1 {

	public static void main(String[] args) {
		String elementCSV;
		int posicioInicialComa;
		int comptadorComes = 0;
		int posicioFinalComa;
		String cadenaCSV = ("hola, que, tal, chavalote");
		int elementAExtreure = 2;
		 //coma = elementAExtreure -1
		 //indexOF(",");
		 //charAt();
		for (int i = 0; i < cadenaCSV.length(); i++) {
			if (cadenaCSV.charAt(i) == ',') {
				comptadorComes++;
				posicioInicialComa = cadenaCSV.indexOf(",");
				System.out.println(posicioInicialComa);
				posicioFinalComa = cadenaCSV.indexOf(",", i+1);
				System.out.println(posicioFinalComa);
				if (elementAExtreure == comptadorComes-1) {
					elementCSV = cadenaCSV.substring(posicioInicialComa, posicioFinalComa);
					break;
				}
			}
		}
	}

}