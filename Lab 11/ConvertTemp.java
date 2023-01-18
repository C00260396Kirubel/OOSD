
//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Action;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConvertTemp extends JFrame {
	
    
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(4, 4));
		


		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
		fahrenField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fahrenheitText = fahrenField.getText(); //string input from fahrenfield
				if (!fahrenheitText.isEmpty()) {
					int fahrenheit = Integer.parseInt(fahrenheitText);// string to int input conversion
					int celsius = (fahrenheit - 32) * 5/9;
					celsiusField.setText(Integer.toString(celsius));//string output from int
				}
			}
		});
		
		
        

		add(new JLabel("Celsius"));
		add(celsiusField);

        // Add Celsius label and text field to frame
		celsiusField.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String celsiusText = celsiusField.getText();
				if (!celsiusText.isEmpty()) {
					int celsius = Integer.parseInt(celsiusText);
					int fahrenheit = (celsius * 9/5) + 32;
					fahrenField.setText(Integer.toString(fahrenheit));
				}
			}
		});
		
		


		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor


	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

}//end class