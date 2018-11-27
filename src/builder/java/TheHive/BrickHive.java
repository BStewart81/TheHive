package builder.java.TheHive;

import java.util.Vector;

import decorator.java.TheHive.BrickBeeDecorator;


public class BrickHive implements HiveInterface {
	
	
	private String name;
	private String species;
	private Vector <BeeInterface> bees;
	private static int count=0;
	
	
	
	public BrickHive() {
		
		name = "BrickBee" + String.valueOf(count);;
		species = "brick";
		bees = new Vector<BeeInterface>();
		populateHive();
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
    
    @Override
    public void populateHive() {
    	
    	
    	    	
    	for (int i = 0; i < 50; i++) {
    	
    		
    		BrickBeeDecorator buzz = new BrickBeeDecorator(new Bee());
    			if (i <= 4) {
    				buzz.setRole("queen");
    			} else if (i > 4 && i <= 25) {
    				buzz.setRole("warrior");
    			} else {
    				buzz.setRole("drone");
    			}
    			buzz.setHive(getName());
        		
    			bees.add(buzz);
        	 		
    	}
    }



	@Override
	public void deleteBee(BeeInterface be) {
		bees.remove(be);
		
	}




}
