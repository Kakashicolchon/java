
public class Teoria01 {

	public static void main(String[] args) {
		//Teoria taules 1
		int t; //declaro una variable t para mas adelante
		
		// tipus [] nom = new tipus [mida]
		
		//Creamos una tabla de 7 valores de tipo double.
		double [] temperaturesX = new double[7];
		
		
		//Creamos una tabla que tenga 5 elementos y exactamente serán estos elementos
		int[] notes = {5, 7, 6, 4, 2};
		
		
		//Y de forma completa declaración + creación
		
		int[] notes2 = new int[5];
		notes2[0] = 5; //En la posicion numero "0" ponemos el numero 5 como valor
		notes2[1] = 7; //En la posicion numero "1" ponemos el numero 7 como valor
		notes2[2] = 6; //En la posicion numero "2" ponemos el numero 6 como valor
		notes2[3] = 4; //En la posicion numero "3" ponemos el numero 4 como valor
		notes2[4] = 2; //En la posicion numero "4" ponemos el numero 2 como valor
		
		//Ejemplo que puso el profe
		
		int[] notes3 = new int[5];
		for (int i = 0; i < 5; i++) {
			System.out.println(notes3[i]);
			//los valores por defecto de una tabla será el valor por defecto del tipo de valores, en el caso de int, 0.
			
		}
		System.out.println("--------------------------------");
		
		//para hacer referencia a un elemento de la tabla
		//Elemento 4 de la tabla "notes2"
		System.out.println(notes2[4]);
		
		//cambiamos el valor de un elemento 
		notes2[4] = 66;
		System.out.println("EXECUTE THE ORDER " + notes2[4]);
		
		
		//Coger el valor de una posición
		t = notes2[4];
		//ahora t tiene el valor de la posición 4 de la tabla notas2.
		
		System.out.println("--------------------------------");
		//Última posicion de la tabla
		System.out.println(notes2[notes2.length -1]); 
		
		
		
		System.out.println("--------------------------------");
		
		
		//Recorregut de taules unidimensionals en java
		double[] temperatures = {23.2, 21.7, 18.4, 19.2, 15.6, 14.0, 14.31};
		double sumaTemperatures;
		double mitjaTempertaures;
		
		sumaTemperatures = 0;
		
		for (int i = 0; i < temperatures.length; i++) {
			sumaTemperatures = sumaTemperatures + temperatures[i];
		}
		if (temperatures.length > 0) {
			mitjaTempertaures = sumaTemperatures / temperatures.length;
			System.out.println("Suma temperatures: " + sumaTemperatures);
			System.out.println("Mitja Temperatures: " + mitjaTempertaures);
		}
		else {
			System.out.println("No hi ha cap valor per poder calcular la mitja.");
		}
		
		//Copiar una tabla
		int[] t1 = {1};
		int[] t2 = {};
		//desde la posicion 0 de t1, hasta la t2 (desde la posicion 0 de t2) copia desde 0 hasta lenght de toda la tabla t1.
		System.arraycopy(t1, 0, t2, 0, t1.length);
		
		
	}

}
