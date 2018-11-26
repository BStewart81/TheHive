package main.java.TheHive;

import java.util.Vector;

/*************
 * Apiary Class
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 * this is a Singleton class that creates an Apiary
 */

public class Apiary {
	
	

	
	private static final Apiary INSTANCE = new Apiary();
	
	private Vector <Hive> HiveList;
    private int rndm;
    private int speciesChooser;
    
	
    /*************
     * Apiary construcor method.
     * 
     * creates an apiary
     */
    private Apiary() {
    	
    	HiveList = new Vector<Hive>();
    		
    }
    
    /*************
     * getInstance method.
     * 
     * returns the single Apiary instance
     * 
     * @return Apiary 
     */
    public static Apiary getInstance(){
        return INSTANCE;
    }
    
    
}
