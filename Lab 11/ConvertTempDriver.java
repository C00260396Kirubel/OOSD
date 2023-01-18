
import javax.swing.JFrame;

public class ConvertTempDriver {

	public static void main(String[] args) {
		
		ConvertTemp  convertTemp = new ConvertTemp("Temperature Conversion");
		convertTemp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		convertTemp.setSize(200, 100);
		convertTemp.setLocation(500,400);
		convertTemp.setVisible(true);

	}//end main

}//end class