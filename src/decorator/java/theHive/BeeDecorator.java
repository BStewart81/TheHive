package decorator.java.theHive;

import builder.java.theHive.BeeInterface;

/*************
 * BeeDecorator Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class creates a bee decorator from the the Bee interface
 */

public abstract class BeeDecorator implements BeeInterface {

    protected BeeInterface decoratedBee;

    public BeeDecorator(BeeInterface decoratedBee) {
        this.decoratedBee = decoratedBee;
    }

    /*********
     * sets the species of the bee.
     * 
     * @param sp is the new species
     */
    public void setSpecies(String sp) {

        decoratedBee.setSpecies(sp);

    }

    /*********
     * gets the species of the bee.
     * 
     * @return you recieve the species of the bee
     */
    public String getSpecies() {

        return decoratedBee.getSpecies();
    }

}
