package builder.java.theHive;

import decorator.java.theHive.BeeDecorator;
import decorator.java.theHive.BrickBeeDecorator;

import java.util.Vector;

/*************
 * BrickHive Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class creates a brick hive
 */

public class BrickHive implements HiveInterface {

    private String name;
    private String species;
    private Vector<BeeDecorator> bees;
    private static int count = 0;

    /*********
     * creates a brick hive.
     */
    public BrickHive() {

        name = "BrickBee" + String.valueOf(count);
        ;
        species = "brick";
        bees = new Vector<BeeDecorator>();
        populateHive();
    }

    public void setName(String nm) {

        name = nm;
    }

    public void setSpecies(String sp) {

        species = sp;
    }

    public void addBee(BeeDecorator be) {

        bees.add(be);
    }

    public String getName() {

        return name;
    }

    public String getSpecies() {

        return species;
    }

    public Vector<BeeDecorator> getBees() {

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
    public void deleteBee(BeeDecorator be) {
        bees.remove(be);

    }

}
