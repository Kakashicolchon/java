import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.eclipse.wb.swt.SWTResourceManager;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Composite;

public class Calculadora1 {
	private static Text pantalla;
	private static String operand1;
	private static String operador;
	private static Double num1;
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(591, 417);
		shell.setText("SWT Application");
		
		Composite matrix = new Composite(shell, SWT.NONE);
		matrix.setBounds(0, 0, 565, 369);
		
		Button button_0 = new Button(shell, SWT.NONE);
		button_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "0");
			}
		});
		button_0.setText("0");
		button_0.setBounds(10, 292, 119, 74);
		
		Button button1 = new Button(shell, SWT.NONE);
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "1");
			}
		});
		button1.setText("1");
		button1.setBounds(10, 218, 119, 74);
		
		Button button4 = new Button(shell, SWT.NONE);
		button4.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "4");
			}
		});
		button4.setText("4");
		button4.setBounds(10, 144, 119, 74);
		
		Button button7 = new Button(shell, SWT.NONE);
		button7.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "7");
			}
		});
		button7.setText("7");
		button7.setBounds(10, 68, 119, 74);
		
		Button button2 = new Button(shell, SWT.NONE);
		button2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "2");
			}
		});
		button2.setText("2");
		button2.setBounds(131, 218, 119, 74);
		
		Button button5 = new Button(shell, SWT.NONE);
		button5.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "5");
			}
		});
		button5.setText("5");
		button5.setBounds(131, 144, 119, 74);
		
		Button button6 = new Button(shell, SWT.NONE);
		button6.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "6");
			}
		});
		button6.setText("6");
		button6.setBounds(252, 144, 119, 74);
		
		Button button3 = new Button(shell, SWT.NONE);
		button3.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "3");
			}
		});
		button3.setText("3");
		button3.setBounds(252, 218, 119, 74);
		
		Button button8 = new Button(shell, SWT.NONE);
		button8.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "8");
			}
		});
		button8.setText("8"); 
		button8.setBounds(131, 68, 119, 74);
		
		Button button9 = new Button(shell, SWT.NONE);
		button9.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "9");
			}
		});
		button9.setText("9");
		button9.setBounds(252, 68, 119, 74);
		
		Button sumar = new Button(shell, SWT.NONE);
		sumar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				operador = "+";
				operand1=pantalla.getText();
				pantalla.setText("");
			}
		});
		sumar.setText("+");
		sumar.setBounds(374, 292, 119, 74);
		
		Button igual = new Button(shell, SWT.NONE);
		igual.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				num1 = Double.parseDouble(operand1);
				switch (operador) {
				case "+": 
					num1 = num1+Double.parseDouble(pantalla.getText());
					pantalla.setText(num1.toString());
					break;
				case "-": 
					num1 = num1-Double.parseDouble(pantalla.getText());
					pantalla.setText(num1.toString());
					break;
				case "*": 
					num1 = num1*Double.parseDouble(pantalla.getText());
					pantalla.setText(num1.toString());
					break;
				case "/": 
					num1 = num1/Double.parseDouble(pantalla.getText());
					pantalla.setText(num1.toString());
					break;
				default:
					pantalla.setText("Error en l'operador: ha de ser +, -, *, /");
				}
			}
		});
		igual.setText("=");
		igual.setBounds(252, 292, 119, 74);
		
		Button restar = new Button(shell, SWT.NONE);
		restar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				operador = "-";
				operand1=pantalla.getText();
				pantalla.setText("");
			}
		});
		restar.setText("-");
		restar.setBounds(374, 218, 119, 74);
		
		Button dividir = new Button(shell, SWT.NONE);
		dividir.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				operador = "/";
				operand1=pantalla.getText();
				pantalla.setText("");
			}
		});
		dividir.setText("/");
		dividir.setBounds(374, 144, 119, 74);
		
		Button multiplicar = new Button(shell, SWT.NONE);
		multiplicar.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				operador = "*";
				operand1=pantalla.getText();
				pantalla.setText("");
			}
		});
		multiplicar.setText("*");
		multiplicar.setBounds(374, 68, 119, 74);
		
		pantalla = new Text(shell, SWT.BORDER | SWT.RIGHT);
		pantalla.setFont(SWTResourceManager.getFont("Segoe UI", 27, SWT.NORMAL));
		pantalla.setBounds(10, 10, 555, 52);
		
		Button butonC = new Button(shell, SWT.NONE);
		butonC.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText("");
			}
		});
		butonC.setBounds(499, 68, 68, 150);
		butonC.setText("C");
		
		Button coma = new Button(shell, SWT.NONE);
		coma.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ ".");
			}
		});
		coma.setBounds(131, 292, 119, 74);
		coma.setText(",");
		
		Button btnAc = new Button(shell, SWT.NONE);
		btnAc.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText("");
				operand1 = "0";
				num1 = 0.0;
			}
		});
		btnAc.setText("AC");
		btnAc.setBounds(499, 218, 68, 151);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
