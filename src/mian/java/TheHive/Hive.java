package mian.java.TheHive;

import java.util.Vector;

public class Hive {
	
	private String name;
	private String species;
	private Vector <Bee> bees;
	private static int count=0;
	private int pop;
	
	
	public Hive() {
		
		name = "";
		species = "";
		bees = new Vector<Bee>();
		
	}
	
public Hive(String spc) {
		
		name = spc + String.valueOf(count);
		count++;
		species = spc;
		bees = new Vector<Bee>();
		populateHive(spc);
				
	}

	public void setName(String nm) {
		
		name = nm;
	}
	
	public void setSpecies(String sp) {
		
		species = sp;
	}
	
    public void addBee(Bee be) {
		
		bees.add(be);
	}
    
    public String getName() {
    	
    	return name;
    }
    
    public String getSpecies() {
    	
    	return species;
    }
    
    public Vector<Bee> getBees(){
    	
    	return bees;
    }
    
    public void populateHive(String sp) {
    	
    	pop = (int)((Math.random() * 9)+10);
    	
    	for (int i = 0; i < pop; i++) {
    		
    		Bee buzz = new Bee(sp);
    		bees.add(buzz);
    		    		
    	}
    }
}
