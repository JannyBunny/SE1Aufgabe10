/**
 * 
 */
package Control;

import Model.model;
import View.v2;
import View.view;

/**
 * @author jan-rene.gruenhagen
 *
 */
public class control {
	static int position=0;
	v2 newv2;
	static model daten;
	view newview;
	public control() throws Exception { 
		try {
			 newview=new view();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		newv2=new v2();
		daten= new model();
	}
	
	public static void setmat(String Daten) {

		daten.setDaten(Daten,position);
		
		position++;
	}

	//fehler, keine Matr. Nr. eingegeben 
	//logik kommt hierhin
	String mat;
	public String getMat() throws Exception {
		if (position < 1 )
			throw new Exception("bisher keine Daten");
		for (int i=0; i<=position;i++)
			mat+=daten.getData(i);
		return mat;
		
	}
	
}
