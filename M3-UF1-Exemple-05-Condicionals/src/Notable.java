import java.util.Scanner;

public class Notable {

	public static void main(String[] args) {


		double nota;
		Scanner s = new Scanner(System.in);

		//preguntem la nota a l'usuari

		System.out.print("Quina nota tens?: ");
		nota = s.nextDouble();
		if (nota>=7) {
			if (nota<9) {
				System.out.println("La teva nota és de notable.");
			}
		}
		s.close();
	}
}