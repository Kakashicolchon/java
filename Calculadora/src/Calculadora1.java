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

public class Calculadora1 {
	private static Text pantalla;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(524, 495);
		shell.setText("SWT Application");
		
		Button button_0 = new Button(shell, SWT.NONE);
		button_0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		button_0.setText("0");
		button_0.setBounds(10, 372, 119, 74);
		
		Button button1 = new Button(shell, SWT.NONE);
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText(pantalla.getText()+ "1");
			}
		});
		button1.setText("1");
		button1.setBounds(10, 298, 119, 74);
		
		Button button4 = new Button(shell, SWT.NONE);
		button4.setText("4");
		button4.setBounds(10, 224, 119, 74);
		
		Button button7 = new Button(shell, SWT.NONE);
		button7.setText("7");
		button7.setBounds(10, 148, 119, 74);
		
		Button button2 = new Button(shell, SWT.NONE);
		button2.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.NORMAL));
		button2.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				pantalla.setText("2");
			}
		});
		button2.setText("2");
		button2.setBounds(131, 298, 119, 74);
		
		Button button5 = new Button(shell, SWT.NONE);
		button5.setText("5");
		button5.setBounds(131, 224, 119, 74);
		
		Button button6 = new Button(shell, SWT.NONE);
		button6.setText("6");
		button6.setBounds(252, 224, 119, 74);
		
		Button button3 = new Button(shell, SWT.NONE);
		button3.setText("3");
		button3.setBounds(252, 298, 119, 74);
		
		Button button8 = new Button(shell, SWT.NONE);
		button8.setText("8");
		button8.setBounds(131, 148, 119, 74);
		
		Button button9 = new Button(shell, SWT.NONE);
		button9.setText("9");
		button9.setBounds(252, 148, 119, 74);
		
		Button sumar = new Button(shell, SWT.NONE);
		sumar.setText("+");
		sumar.setBounds(374, 372, 119, 74);
		
		Button igual = new Button(shell, SWT.NONE);
		igual.setText("=");
		igual.setBounds(131, 372, 240, 74);
		
		Button restar = new Button(shell, SWT.NONE);
		restar.setText("-");
		restar.setBounds(374, 298, 119, 74);
		
		Button dividir = new Button(shell, SWT.NONE);
		dividir.setText("/");
		dividir.setBounds(374, 224, 119, 74);
		
		Button multiplicar = new Button(shell, SWT.NONE);
		multiplicar.setText("*");
		multiplicar.setBounds(374, 148, 119, 74);
		
		pantalla = new Text(shell, SWT.BORDER | SWT.RIGHT);
		pantalla.setFont(SWTResourceManager.getFont("Segoe UI", 33, SWT.NORMAL));
		pantalla.setBounds(10, 10, 483, 132);

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
