/**
 * 
 */
package Model;

/**
 * @author jan-rene.gruenhagen
 *
 */
public class model {
	private String daten[];
	public model() {
		daten = new String[1];
		}
	
	public void setDaten(String Data,int i) {
		daten[i]=Data;
	}
	
	public String getData(int i) {
		return daten[i];
	}
}

//Daten wie student kommt hierher