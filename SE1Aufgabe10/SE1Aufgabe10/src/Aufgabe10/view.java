/**
 * 
 */
package Aufgabe10;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * @author jan-rene.gruenhagen
 *
 */
public class view extends JFrame{
	
	private JTextField field;
	private JButton button;
	
	public view() {
		field=new JTextField("");
		add(field);
		setTitle("Martrikelnummern");
		setSize(100,100);
		button=new JButton("Absenden");
		add(button);
		
		setVisible(true);
		

	
	}

//	public static void  view() {
//	view newview=new view();
//
//}


}

//public  class view {
//
//	public static void main(String[] args) {
//		view newview=new view();
//
//	}
//
//}
