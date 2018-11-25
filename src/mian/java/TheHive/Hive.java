package mian.java.TheHive;

import java.util.Vector;

public class Hive {
	
	private String name;
	private String species;
	private Vector <BeeInterface> bees;
	private static int count=0;
	private int pop;
	
	
	public Hive() {
		
		name = "";
		species = "";
		bees = new Vector<BeeInterface>();
		
	}
	
public Hive(String spc) {
		
		name = spc + String.valueOf(count);
		count++;
		species = spc;
		bees = new Vector<BeeInterface>();
		populateHive(spc);
				
	}

	public void setName(String nm) {
		
		name = nm;
	}
	
	public void setSpecies(String sp) {
		
		species = sp;
	}
	
    public void addBee(BeeInterface be) {
		
		bees.add(be);
	}
    
    public String getName() {
    	
    	return name;
    }
    
    public String getSpecies() {
    	
    	return species;
    }
    
    public Vector<BeeInterface> getBees(){
    	
    	return bees;
    }
    
    public void populateHive(String sp) {
    	
    	pop = (int)((Math.random() * 9)+10);
    	    	
    	for (int i = 0; i < pop; i++) {
    	
    		if (sp.equals("brick")) {
    		BrickBeeDecorator buzz = new BrickBeeDecorator(new Bee());
    			bees.add(buzz);
    		} else if(sp.equals("steel")) {
        		SteelBeeDecorator buzz = new SteelBeeDecorator(new Bee());
        		bees.add(buzz);
        	} else if(sp.equals("electric")) {
        		ElectricBeeDecorator buzz = new ElectricBeeDecorator(new Bee());
        		bees.add(buzz);
        	} else if(sp.equals("wood")) {
        		WoodBeeDecorator buzz = new WoodBeeDecorator(new Bee());
        		bees.add(buzz);
        	}
    		
    		
    		
    		    		
    	}
    }
}
