package builder.java.theHive;

import java.util.Vector;

import decorator.java.theHive.BeeDecorator;

/*************
 * HiveInterface Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class is the interface for all Hives
 */
public interface HiveInterface {

  public void setName(String nm);

  public void setSpecies(String sp);

  public void addBee(BeeDecorator be);

  public void deleteBee(BeeDecorator be);

  public String getName();

  public String getSpecies();

  public Vector<BeeDecorator> getBees();

  public void populateHive();

}
