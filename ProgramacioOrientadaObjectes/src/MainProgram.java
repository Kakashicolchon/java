
public class MainProgram {

	public static void main(String[] args) {
		//Creem una data per passar-li al creador de llibres.
		Data dataExemple = new Data(14, 5, 2018);
		//Creem el llibre
		Llibre llibreExemple = new Llibre("TitolExemple", "978-3-16-148410-0", "AutorExemple", "EditorialExemple", 178, 2, 2017, dataExemple);
		Llibre llibreExemple2 = new Llibre("TitolExemple2", "978-3-16-148410-1", "AutorExemple", "EditorialExemple", 178, 2, 2017, dataExemple);
		//Creem la secció
		Seccio seccioExemple = new Seccio("NomExemple", "23113215456ASD");
		
		//Posem el llibre a la secció
		seccioExemple.addLlibre(llibreExemple);
		seccioExemple.addLlibre(llibreExemple2);
		
		
		seccioExemple.removeLlibre("978-3-16-148410-0");
		//Printejem els llibres de la seccio en concret "seccioExemple".
		seccioExemple.printLlibres();
		
		//Provem el remove
		//seccioExemple.RemoveLlibre("978-3-16-148410-0");
		//seccioExemple.PrintLlibres();
	}

}
