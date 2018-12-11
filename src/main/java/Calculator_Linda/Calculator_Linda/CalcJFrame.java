package Calculator_Linda.Calculator_Linda;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 * Klass CalcJFrame - GUI-klassen i kalkylatorn
 * Detta är den grafiska delen av kalkylatorn.
 * Här sparas parametrarna och skickas iväg till de olika klasserna för att sedan presentera ett resultat.
 * Resultatet presenteras som en double och har en begränsning på två decimaler.
 * 
 * 
 * @author linda
 *
 */

public class CalcJFrame {
	
	/**
	 * Objekt av klassen CalcBasic skapas.
	 * 
	 */
	CalcBasic bas = new CalcBasic();
	
	/**
	 * Objekt av klassen CalcAdv skapas.
	 */
	CalcAdv adv = new CalcAdv();

	JFrame frmLindasKalkylator;
	
	/**
	 * Objekt i form av ett textfält för presentation av input av värdena first och second, 
	 * samt output av resultatet av uträkningen.
	 * 
	 */
	private JTextField textField;
	
	/**
	 * double first : inparameter ett.
	 * @param first : värdet av första värdet i double.
	 */
	double first;
	/**
	 * double second : inparameter två.
	 * @param second : värdet av andra värdet i double.
	 */
	double second;
	/**
	 * double sum : resultatet i en double. 
	 * @param sum : resultatet av värdena i en double.
	 */
	double sum;
	/**
	 * double pi : värdet PI.
	 * @param pi : tar emot värdet av PI i en double.
	 */
	double pi;
	/**
	 * String operations : anger vilken typ av metod/operation som skall utföras
	 * @param operations : sparar och skickar vilken typ av metod/operation som skall användas i klasserna i en String.
	 */
	String operations;
	/**
	 * String svar : svar presenteras i textfältet.
	 * @param svar : svaret omvandlas till en String för att presenteras i textfältet. 
	 */
	String svar;
	
	public CalcJFrame() {
		initialize();
		
	}
	
	private void initialize() {
		frmLindasKalkylator = new JFrame();
		frmLindasKalkylator.setTitle("Lindas Kalkylator");
		frmLindasKalkylator.setBounds(100, 100, 463, 300);
		frmLindasKalkylator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLindasKalkylator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("SansSerif", Font.PLAIN, 14));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 261, 39);
		frmLindasKalkylator.getContentPane().add(textField);
		textField.setColumns(10);

		final JButton btn_7 = new JButton("7");
		btn_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn_7.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_7.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_7.setBounds(10, 61, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_7);

		final JButton btn_8 = new JButton("8");
		btn_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn_8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_8.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_8.setBounds(60, 61, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_8);

		final JButton btn_9 = new JButton("9");
		btn_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn_9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_9.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_9.setBounds(110, 61, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_9);

		final JButton btn_4 = new JButton("4");
		btn_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn_4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_4.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_4.setBounds(10, 107, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_4);

		final JButton btn_5 = new JButton("5");
		btn_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn_5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_5.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_5.setBounds(60, 107, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_5);

		final JButton btn_6 = new JButton("6");
		btn_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn_6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_6.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_6.setBounds(110, 107, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_6);

		final JButton btn_1 = new JButton("1");
		btn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn_1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_1.setBounds(10, 157, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_1);

		final JButton btn_2 = new JButton("2");
		btn_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn_2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_2.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_2.setBounds(60, 157, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_2);

		final JButton btn_3 = new JButton("3");
		btn_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn_3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_3.setBounds(110, 157, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_3);

		final JButton btn_0 = new JButton("0");
		btn_0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textField.getText() + btn_0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn_0.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn_0.setBounds(60, 207, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_0);

		final JButton btn_komma = new JButton(".");
		btn_komma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!textField.getText().contains(".")) {
					textField.setText(textField.getText() + btn_komma.getText());
				}
			}
		});
		btn_komma.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_komma.setBounds(110, 207, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_komma);
		
		
		JButton btn_plusminus = new JButton("\u00B1");
		btn_plusminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double ops = Double.parseDouble(String.valueOf(textField.getText()));
					ops = ops * (-1);
					textField.setText(String.valueOf(ops));		
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_plusminus.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btn_plusminus.setBounds(10, 207, 43, 39);
		frmLindasKalkylator.getContentPane().add(btn_plusminus);
		

		JButton btn_likamed = new JButton("=");
		btn_likamed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try{
					String svar;
					second = Double.parseDouble(textField.getText());
					

					if (operations == "+") {
						svar = String.format("%.2f", bas.add(first, second));
						textField.setText(svar);
					} else if (operations == "-") {
						svar = String.format("%.2f", bas.sub(first, second));
						textField.setText(svar);
					} else if (operations == "*") {
						svar = String.format("%.2f", bas.mult(first, second));
						textField.setText(svar);
					} else if (operations == "/") {
						svar = String.format("%.2f", bas.div(first, second));
						textField.setText(svar);
					} else if (operations == "%") {
						svar = String.format("%.2f", bas.modulus(first, second));
						textField.setText(svar);
					}		
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_likamed.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_likamed.setBounds(159, 207, 112, 39);
		frmLindasKalkylator.getContentPane().add(btn_likamed);
		

		JButton btn_plus = new JButton("+");
		btn_plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					first= Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "+";			
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_plus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_plus.setBounds(159, 157, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_plus);
		
		
		JButton btn_minus = new JButton("-");
		btn_minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					first= Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "-";			
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_minus.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_minus.setBounds(219, 157, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_minus);

		JButton btn_multip = new JButton("x");
		btn_multip.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					first= Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "*";			
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_multip.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_multip.setBounds(159, 107, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_multip);
		
		
		JButton btn_divi = new JButton("\u00F7");
		btn_divi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					first= Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "/";			
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
			}
		});
		btn_divi.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_divi.setBounds(219, 107, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_divi);
		
		
		JButton btn_back = new JButton("\u2190");
		btn_back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backs = null;

				if (textField.getText().length() > 0) {
					StringBuilder s = new StringBuilder(textField.getText());
					s.deleteCharAt(textField.getText().length() - 1);
					backs = s.toString();
					textField.setText(backs);
				}
			}
		});
		btn_back.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_back.setBounds(159, 61, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_back);
		
		
		JButton btn_c = new JButton("C");
		btn_c.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btn_c.setFont(new Font("Tahoma", Font.BOLD, 18));
		btn_c.setBounds(219, 61, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_c);
		
		
		JButton btn_sin = new JButton("sin");
		btn_sin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double x = Double.parseDouble(String.valueOf(textField.getText()));
					textField.setText(String.valueOf(adv.sin(x)));		
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_sin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_sin.setBounds(323, 63, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_sin);
		
		
		JButton btn_cos = new JButton("cos");
		btn_cos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double x = Double.parseDouble(String.valueOf(textField.getText()));
					textField.setText(String.valueOf(adv.cos(x)));	
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_cos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_cos.setBounds(323, 109, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_cos);
		
		
		JButton btn_tan = new JButton("tan");
		btn_tan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double x = Double.parseDouble(String.valueOf(textField.getText()));
					textField.setText(String.valueOf(adv.tan(x)));
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_tan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btn_tan.setBounds(323, 159, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_tan);
		
		
		JButton btn_modulus = new JButton("%");
		btn_modulus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					first = Double.parseDouble(textField.getText());
					textField.setText("");
					operations = "%";
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_modulus.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_modulus.setBounds(323, 207, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_modulus);
		
		
		JButton btn_pi = new JButton("\u03C0");
		btn_pi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(Double.toString(adv.pi()));
			}
		});
		btn_pi.setFont(new Font("Sylfaen", Font.PLAIN, 20));
		btn_pi.setBounds(385, 61, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_pi);
		
		
		JButton btn_rot = new JButton("\u221A");
		btn_rot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double x = Double.parseDouble(textField.getText());
					textField.setText(Double.toString(adv.sqa(x)));
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_rot.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btn_rot.setBounds(385, 108, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_rot);
		
		
		JButton btnX = new JButton("x\u00B2");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double x = Double.parseDouble(String.valueOf(textField.getText()));
					textField.setText(String.valueOf(adv.x2(x)));
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnX.setBounds(385, 158, 52, 39);
		frmLindasKalkylator.getContentPane().add(btnX);
		
		
		JButton btn_tio = new JButton("10\u02DF");
		btn_tio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					double tio = Double.parseDouble(String.valueOf(textField.getText()));
					textField.setText(String.valueOf(adv.tenX(tio)));
		        }
		        catch (Exception d){
		            JOptionPane.showMessageDialog(null, "Felmeddelande! Du har fyllt i något fel. Försök igen");
		        }
				
			}
		});
		btn_tio.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btn_tio.setBounds(385, 207, 52, 39);
		frmLindasKalkylator.getContentPane().add(btn_tio);
		}

}
