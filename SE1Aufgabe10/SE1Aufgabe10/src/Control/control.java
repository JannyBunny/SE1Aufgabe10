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
	int position=0;
	v2 newv2;
	model daten;
	view newview;
	public control() throws Exception { 
		try {
			 newview=new view(this);
			 newv2=new v2(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		daten= new model();
	}
	
	public void setmat(String Daten) {
		daten.setDaten(Daten, position);
		//System.out.println("Daten:"+Daten+"und Position:"+position);
		position++;

	}

	//fehler, keine Matr. Nr. eingegeben 
	//logik kommt hierhin
	String mat="";
	public String getMat() throws Exception {
		if (position < 1 )
			throw new Exception("bisher keine Daten");
		for (int i=position-1; i< daten.getlength();i++) {
			mat+=daten.getData(i);
			mat+=",";
			//System.out.println("\n MAT:"+mat);
		}
		return mat;
		
	}
	
}
