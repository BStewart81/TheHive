package singleton.java.TheHive;

import java.util.Vector;

import builder.java.TheHive.Hive;

/*************
 * Apiary Class
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 * this is a Singleton class that creates an Apiary
 */

public class Apiary {
	
	

	
	private static final Apiary INSTANCE = new Apiary();
	
	private static Vector <Hive> HiveList;
       
	
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
    
    /*************
     * getHiveList method.
     * 
     * returns the single Apiary's HiveList
     * 
     * @return Vector<Hive> 
     */
    public static Vector<Hive> getHiveList(){
    	
    	return HiveList;
    }
    
    /*************
     * addToHiveList.
     * 
     * adds given Hive to HiveList
     * 
     * @param Hive
     */
    public static void addToHiveList(Hive hv) {
    	
    	HiveList.add(hv);
    	
    }
    
    /*************
     * removeFromHiveList.
     * 
     * removes given Hive from HiveList
     * 
     * @param Hive
     */
    public static void removeFromHiveList(Hive hv) {
    	
    	HiveList.remove(hv);
    	
    }
}
