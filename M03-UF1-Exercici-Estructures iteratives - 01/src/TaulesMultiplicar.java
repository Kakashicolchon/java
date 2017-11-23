
public class TaulesMultiplicar {

	public static void main(String[] args) {
		for (int t = 1; t <= 10; t++) {
			System.out.println("Taula del " + t);
			System.out.println("-------------");
			for (int i = 0; i <= 10; i++) {
				System.out.printf("%2d x %2d = %3d\n", t, i, t*i);
			}
			System.out.println("\n");
		}

	}

}
