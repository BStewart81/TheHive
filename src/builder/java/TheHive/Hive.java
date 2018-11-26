package builder.java.TheHive;

import java.util.Vector;

import decorator.java.TheHive.BrickBeeDecorator;
import decorator.java.TheHive.ElectricBeeDecorator;
import decorator.java.TheHive.SteelBeeDecorator;
import decorator.java.TheHive.WoodBeeDecorator;

public class Hive {
	
	private String name;
	private String species;
	private Vector <BeeInterface> bees;
	private static int count=0;
	private int pop;
	public String[] speciesList = {"brick","electric","steel","wood"}; 
	
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
    			if (i==1 || i==11) {
    				buzz.setQueen(1);
    			}
    			bees.add(buzz);
    		} else if(sp.equals("steel")) {
        		SteelBeeDecorator buzz = new SteelBeeDecorator(new Bee());
        		if (i==1 || i==11) {
    				buzz.setQueen(1);
    			}
        		bees.add(buzz);
        	} else if(sp.equals("electric")) {
        		ElectricBeeDecorator buzz = new ElectricBeeDecorator(new Bee());
        		if (i==1 || i==11) {
    				buzz.setQueen(1);
    			}
        		bees.add(buzz);
        	} else if(sp.equals("wood")) {
        		WoodBeeDecorator buzz = new WoodBeeDecorator(new Bee());
        		if (i==1 || i==11) {
    				buzz.setQueen(1);
    			}
        		bees.add(buzz);
        	}
    		
    		
    		
    		    		
    	}
    }

	public void printHive() {
		
		bees.forEach(Bee->
    		System.out.println(Bee));
    	    
    	
		
	}
	
	/**********8
	 * 
	 *  private int rndm;
     *private int speciesChooser;
	 * 
	 *
    	
    	 public void printHives() {
    	
    	this.getInstance().HiveList.forEach(Hive->{
    		System.out.println(Hive.getName());
    	    Hive.printHive();
    	});
    }

	 * 
	 * 
	 *
	 */
}
