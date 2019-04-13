package io;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;

/**
 * Main Window for GUI
 * @author Hassan and Sam
 *
 */
public class MainWindow {
	
	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			MainWindow window = new MainWindow();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(438, 197);
		shell.setText("SWT Application");
		
		Button btnFindShelter = new Button(shell, SWT.NONE);
		btnFindShelter.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				shell.dispose();
				FindShelter FindShelter = new FindShelter();
				FindShelter.open();
			}
		});
		btnFindShelter.setBounds(10, 65, 198, 30);
		btnFindShelter.setText("Find Shelter");
		
		Button btnFindNearestCooling = new Button(shell, SWT.NONE);
		btnFindNearestCooling.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
		        shell.dispose();
				FindCoolingCentre CoolingCenter = new FindCoolingCentre();
				CoolingCenter.open();
			}
		});
		btnFindNearestCooling.setBounds(214, 65, 198, 30);
		btnFindNearestCooling.setText("Find Nearest Cooling Center");

	}
}
