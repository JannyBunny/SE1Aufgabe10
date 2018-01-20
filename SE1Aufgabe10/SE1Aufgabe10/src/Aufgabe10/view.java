/**
 * 
 */
package Aufgabe10;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author jan-rene.gruenhagen
 *
 */
public class view extends JFrame{
	
	private JTextField field;
	JFrame panel;
	private JButton button;
	
	public view() {
		panel=new JFrame("Matrikelnummern");
		JPanel inhalt=new JPanel(new FlowLayout());
		field=new JTextField("Matrikelnummern");
		panel.setContentPane(inhalt);
		inhalt.add(field);
		field.setSize(100,100);
		button=new JButton("Absenden");
		inhalt.add(button);
		panel.pack();
		panel.setVisible(true);
		panel.setLocation(800,300);
		panel.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
