package Calculator_Linda.Calculator_Linda;

import java.awt.EventQueue;

/**
 * Main-klassen i Kalkylatorn
 * 
 * @author linda
 * @version 1.0
 */

public class CalcMain {

	CalcJFrame frame = new CalcJFrame();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcMain window = new CalcMain();
					window.frame.frmLindasKalkylator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
