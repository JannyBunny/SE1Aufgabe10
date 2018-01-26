/**
 * 
 */
package Model;

import java.util.ArrayList;

/**
 * @author jan-rene.gruenhagen
 *
 */
public class model {
	private ArrayList<String> daten;
	public model() {
		daten = new ArrayList<String>();
		}
	
	public void setDaten(String Data, int i) {
		daten.add(i, Data);

	}
	
	public String getData(int i) throws Exception {
		if (i < 0)
			throw new Exception("Index ist zu klein:"+i+"maximaler:"+daten.size());
		return (String)daten.get(i);
	}

	public int getlength() {
		// TODO Auto-generated method stub
		return daten.size();
	}
}

//Daten wie student kommt hierher