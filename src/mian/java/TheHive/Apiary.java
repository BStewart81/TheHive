package mian.java.TheHive;

import java.util.Vector;


public class Apiary {
	
	public String[] speciesList = {"brick","electric","steel","wood"}; 

	
	private static final Apiary INSTANCE = new Apiary();
	
	private Vector <Hive> HiveList;
    private int rndm;
    private int speciesChooser;
    
	private Apiary() {
    	
    	HiveList = new Vector<Hive>();
    	
    	rndm = (int)((Math.random() * 9)+1);
    	
    	for (int i = 0; i < rndm; i++) {
    		
    		speciesChooser = (int)(Math.random() * 3);
    		Hive HV = new Hive(speciesList[speciesChooser]);
    		
    		
    	}
    	
    }
 
    public static Apiary getInstance(){
        return INSTANCE;
    }

}
