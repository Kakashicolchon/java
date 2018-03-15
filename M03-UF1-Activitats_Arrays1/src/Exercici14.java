import java.util.Arrays;

public class Exercici14 {

	public static void main(String[] args) {
		int [][] enters = {
				{4, 12, 2, 9, 9, 15, 5},
				{17, 8, 13, 2, 24, 20, 3},
				{1, 31, 7, 18, 27, 14, 19},
				{10, 9, 14, 21, 6, 7, 8},
				{11, 21, 6, 5, 16, 3, 12},
				//Les sumes haurien de ser 43,81,42,55,82,59,47
		};
		int suma[] = new int[enters[0].length];
		int seguentCasella = 0;
		
		for (int c = 0; c < enters[0].length; c++) {
			
			for (int f = 0; f < enters.length; f++) {
				suma[seguentCasella] = suma[seguentCasella] + enters[f][c];
			}
			seguentCasella++;
		}
		System.out.println(Arrays.toString(suma));
	}

}
