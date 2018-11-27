package builder.java.TheHive;

import java.util.Vector;

import decorator.java.TheHive.ElectricBeeDecorator;

public class ElectricHive implements HiveInterface {
	
	private String name;
	private String species;
	private Vector <BeeInterface> bees;
	private static int count=0;
	
	
	
	public ElectricHive() {
		
		name = "ElectricBee" + String.valueOf(count);;
		species = "electric";
		bees = new Vector<BeeInterface>();
		populateHive();
	}
	
  
	@Override
	public void setName(String nm) {
		
		name = nm;
	}
	
	@Override
	public void setSpecies(String sp) {
		
		species = sp;
	}
	
	@Override
    public void addBee(BeeInterface be) {
		
		bees.add(be);
	}
    
	@Override
    public String getName() {
    	
    	return name;
    }
    
	@Override
    public String getSpecies() {
    	
    	return species;
    }
    
	@Override
    public Vector<BeeInterface> getBees(){
    	
    	return bees;
    }
    
    @Override
    public void populateHive() {
    	
    	
    	    	
    	for (int i = 0; i < 50; i++) {
    	
    		
    		ElectricBeeDecorator buzz = new ElectricBeeDecorator(new Bee());
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
