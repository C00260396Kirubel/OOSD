
//Displays a frame containing two buttons. Pressing the
//"Lighter" button lightens the background of the frame.
//Pressing the "Darker" button darkens the background.

import java.awt.event.*;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChangeColour extends JFrame{

		public ChangeColour(String title) {
		    // Set title, layout, and background colour
		    super(title);
		    setLayout(new FlowLayout());
		    getContentPane().setBackground(Color.gray);
		
		    // Create button listener
		    ButtonListener listener = new ButtonListener();
		
		    // Add "Lighter" button to frame and attach listener
		    JButton b = new JButton("Lighter");
		    add(b);
		    b.addActionListener(listener);
		
		    // Add "Darker" button to frame and attach listener
		    b = new JButton("Darker");
		    add(b);
		    b.addActionListener(listener);
		

              // Add "Green" button to frame and attach listener
		    b = new JButton("Green");
		    add(b);
		    b.addActionListener(listener);


              // Add "Blue" button to frame and attach listener
		    b = new JButton("Blue");
		    add(b);
		    b.addActionListener(listener);
		    // Attach window listener

            //pink

            b = new JButton("Pink");
		    add(b);
		    b.addActionListener(listener);
		    // Attach window listener

		    addWindowListener(new WindowCloser());

        }

            class ButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent evt) {
                    Color currentBackground =  getContentPane().getBackground();
                    String buttonLabel = evt.getActionCommand();
            
                    if (buttonLabel.equals("Lighter")) {
                        getContentPane().setBackground(currentBackground.brighter());
                    } else if (buttonLabel.equals("Darker")) {
                        getContentPane().setBackground(currentBackground.darker());
                    } else if (buttonLabel.equals("Pink")) {
                        getContentPane().setBackground(Color.PINK);
                    } else if (buttonLabel.equals("Blue")) {
                        getContentPane().setBackground(Color.BLUE);
                    } else if (buttonLabel.equals("Green")) {
                        getContentPane().setBackground(Color.GREEN);
                    }
                }
            }
            
            

		// Listener for window
		class WindowCloser extends WindowAdapter {
			public void windowClosing(WindowEvent evt) {
		 		System.exit(0);
			}
		}

        }
    
    
