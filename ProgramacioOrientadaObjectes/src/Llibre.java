
public class Llibre {
	String titol;
	String isbn;
	String autor;
	String editorial;
	int numPagines;
	int numEdicio;
	int anyEdicio;
	Data dataAdquisicio;
	
	
	//Hacer constructor
	public Llibre(String t, String i, String a, String e, int np, int ne, int ae, Data da) {
		titol = t;
        isbn = i;
        autor = a;
        editorial = e;
        numPagines =  np;
        numEdicio = ne;
        anyEdicio = ae;
        dataAdquisicio = da;
        
    	}
}



