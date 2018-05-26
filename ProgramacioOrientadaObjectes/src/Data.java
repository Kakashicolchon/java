import java.util.Calendar;

public class Data {
	int dia;
	int mes;
	int any;
	
	
	public Data() {
		dia = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
		mes = Calendar.getInstance().get(Calendar.MONTH) + 1;
		any = Calendar.getInstance().get(Calendar.YEAR);

        
    	}
	
	public Data (int d, int m, int a) {
		dia = d;
		mes = m;
		any = a;
	}
	public String toString() {
		return dia + "-" + mes + "-" + any;
	}
}