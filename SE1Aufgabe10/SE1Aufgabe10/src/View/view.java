/**
 * 
 */
package View;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ResourceBundle.Control;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Control.control;

/**
 * @author jan-rene.gruenhagen
 *
 */
public class view extends JFrame{
	
	private JTextField field;
	JFrame panel;
	private JButton button;
	String textFieldValue;
	
	public view(){
		panel=new JFrame("Matrikelnummern");
		JPanel inhalt=new JPanel(new FlowLayout());
		field=new JTextField("",10);
		panel.setContentPane(inhalt);
		panel.setSize(100,100);
		inhalt.add(field);
		button=new JButton("Absenden");
		inhalt.add(button);
		panel.pack();
		panel.setVisible(true);
		panel.setLocation(800,300);
		panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
		button.addActionListener(new ActionListener(){
			   public void actionPerformed(ActionEvent ae){
			      textFieldValue = field.getText();
			      if (textFieldValue.isEmpty()) {
			    	  try {
						throw new Exception("Feld ist leer");
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			      }
			      else
			    	  control.setmat(textFieldValue);
			   }
			});
	}
	
}
