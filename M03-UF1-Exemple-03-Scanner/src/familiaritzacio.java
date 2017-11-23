import java.util.Scanner;

public class familiaritzacio {

	public static void main(String[] args) {
		long valor1;
		long valor2;
		long valor3;
		long resultat;
		Scanner escaner1= new Scanner(System.in);
		System.out.print("Introdueix el 1r valor: ");
		valor1=escaner1.nextInt();
				
		System.out.print("Introdueix el 2n valor: ");
		valor2=escaner1.nextInt();
		
		System.out.print("Introdueix el 3r valor: ");
		valor3=escaner1.nextInt();
		
		resultat = valor1 + valor2 + valor3;
		
		System.out.println("El resultat és: " + resultat);
		
		escaner1.close();
		
		//segon exercici
		
		int var1 = 10;
		int var2 = 15;
		System.out.println("Mira què passa " + var1 + var2 + "!!!");//es concatenen com a strings els valors
		System.out.println(var1 + var2 + "Mira què passa!!!"); //com abans no hi havia strings, 2 ints es sumen
		System.out.println("Mira què passa " + (var1 + var2) + "!!!"); //amb els parèntesis evitem els problemes, es sumen els numeros encara que abans hi hagués un string
		
		//tercer exercici
		
		int i5= 5;
		int i3= 3;
		double d5= 5.0;
		double d3= 3.0;
		double rsd=  i5/i3;
		System.out.println(rsd);
		rsd= i5/d3;
		System.out.println(rsd);
		rsd= d5/i3;
		System.out.println(rsd);
		rsd= d5/d3;
		System.out.println(rsd);
		
		//aquí podem observar que l'únic cas que es menja els decimals es quan dividim els 2 ints
		//i no arrodoneix. Observem que en els altres casos dona un número de decimals X ja que almenys una de les variables
		//era un double(enter)
		
		//Exercici 4
		rsd = (double)i5 / (double)i3;
		System.out.println(rsd); //fa que es contin els decimals, que canvii de int a double, a valors reals
		
		//Exercici 5
		
		
		System.out.println("separador");
		
		int i = 3;
		 i++;
		 System.out.println(i);
		 ++i;
		 System.out.println(i);
		 System.out.println(++i);
		 System.out.println(i++);
		 System.out.println(i);

		//Exercici 6
		
		 int v1 = 5;
		 int v2 = 4;
		 boolean rresultat;
		 rresultat = v1 > v2 && v2++ < 10;  //V2=5
		 System.out.printf("(1) v1 = %d v2 = %d resultat = %b%n",
		 v1, v2, rresultat);
		 rresultat = v1 > v2 && v2++ < 10;   //v2 segueix sent 5!, la primera part del && es FALSE
		 System.out.printf("(2) v1 = %d v2 = %d resultat = %b%n",
		 v1, v2, rresultat);
		 //Posincrement          TOP
		 
		 //Exercici 7
		 System.out.println("Exercici7");
		 int result = 6;
		 	System.out.println(result);
		 			result = result - 1;
		 		System.out.println(result);
		 			result = result * 4;
		 		System.out.println(result);
		 			result = result / 2;
		 		System.out.println(result);
		 			result = result + 8;
		 			result = result % 9;
		 		System.out.println(result);
		 
		 //Exercici 8
		 System.out.println("Exercici8");
		 int a = 1;
		 int b = 2;
		 int c = 3;
			 System.out.println(a = 10);
			 System.out.println(a);
			 System.out.println(b = c = 20);
			 System.out.println(b);
			 System.out.println(c);
			 	a = b = c = 0;
			 System.out.println(a + ", " + b + ", " + c); 

	}

}
