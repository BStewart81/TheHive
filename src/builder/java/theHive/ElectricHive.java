package builder.java.theHive;

import java.util.Vector;

import decorator.java.theHive.BeeDecorator;
import decorator.java.theHive.ElectricBeeDecorator;

/*************
 * ElectricHive Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class creates a electric hive
 */

public class ElectricHive implements HiveInterface {

  private String name;
  private String species;
  private Vector<BeeDecorator> bees;
  private static int count = 0;

  /********
   * creates an electric hive.
   */
  public ElectricHive() {

    name = "ElectricBee" + String.valueOf(count);
    ;
    species = "electric";
    bees = new Vector<BeeDecorator>();
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
  public void addBee(BeeDecorator be) {

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
  public Vector<BeeDecorator> getBees() {

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
  public void deleteBee(BeeDecorator be) {
    bees.remove(be);

  }

}
