package builder.java.TheHive;

import java.util.Vector;

import decorator.java.TheHive.BeeDecorator;

public interface  HiveInterface {

	public void setName(String nm);
	public void setSpecies(String sp);
	 public void addBee(BeeDecorator be);
	 public void deleteBee(BeeDecorator be);
	 public String getName();
	 public String getSpecies();
	 public Vector<BeeDecorator> getBees();
	 public void populateHive();
	
}
