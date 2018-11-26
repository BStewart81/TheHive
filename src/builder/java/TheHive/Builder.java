package builder.java.TheHive;


import singleton.java.TheHive.Apiary;

public class Builder {
	
	 private int rndm;
	 private int speciesChooser;
	 public String[] speciesList = {"brick","electric","steel","wood"}; 
	 
	 
	 
	public void buildApiary() {
		
				
		HiveInterface hv;
		
		rndm = (int)((Math.random() * 9)+4);
		speciesChooser = 1;
		
    	for (int i = 0; i < rndm; i++) {
    		
    		
    		
    		if (speciesChooser == 1) {
    			 hv = new BrickHive();
    		} else if (speciesChooser == 2) {
    			hv = new ElectricHive();
    		} else if (speciesChooser == 3 ) {
    			 hv = new SteelHive();
    		} else {
    			 hv = new WoodHive();
    		}
    		
    		Apiary.addToHiveList(hv);
    		
    		if (speciesChooser >= 4) {
    			speciesChooser = 0;
    		}
    		speciesChooser++;
    		System.out.println("BUILDER created hive");
    		
    		
    		
    	}
	}}


