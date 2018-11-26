package builder.java.TheHive;

import singleton.java.TheHive.Apiary;

public class Builder {
	
	 private int rndm;
	 private int speciesChooser;
	 public String[] speciesList = {"brick","electric","steel","wood"}; 
	 
	 
	 
	public void buildApiary() {
		
		Apiary.getInstance();
		
		rndm = (int)((Math.random() * 9)+1);
    	
    	for (int i = 0; i < rndm; i++) {
    		
    		speciesChooser = (int)(Math.random() * 3);
    		Hive HV = new Hive(speciesList[speciesChooser]);
    		
    		Apiary.addToHiveList(HV);
    		System.out.println("BUILDER created hive");
    		
    		
    		
    	}
	}

}
