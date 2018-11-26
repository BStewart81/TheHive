package builder.java.TheHive;

import singleton.java.TheHive.Apiary;

public class Builder {
	
	 private int rndm;
	 
	 
	public void buildApiary() {
		
		Apiary.getInstance();
		
		rndm = (int)((Math.random() * 9)+1);
    	
    	for (int i = 0; i < rndm; i++) {
    		
    		Hive HV = new Hive();
    		System.out.println("BUILDER created hive");
    		
    	}
	}

}
