package builder.java.TheHive;

import java.util.Vector;

public interface  HiveInterface {

	public void setName(String nm);
	public void setSpecies(String sp);
	 public void addBee(BeeInterface be);
	 public void deleteBee(BeeInterface be);
	 public String getName();
	 public String getSpecies();
	 public Vector<BeeInterface> getBees();
	 public void populateHive();
	
}
