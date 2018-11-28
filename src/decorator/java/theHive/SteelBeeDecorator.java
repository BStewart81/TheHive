package decorator.java.theHive;

import builder.java.theHive.BeeInterface;

/*************
 * SteeleeDecorator Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class decorates a bee as a steel bee
 */
public class SteelBeeDecorator extends BeeDecorator {
    private String color2;

    private static int count = 0;

    /************
     * decorates a bee as a steel bee.
     * 
     * @param decoratedBee is the bee you want to decorate
     */
    public SteelBeeDecorator(BeeInterface decoratedBee) {
        super(decoratedBee);
        this.decoratedBee = decoratedBee;
        if (decoratedBee.getName().equals("")) {
            decoratedBee.setSpecies("steel");
            color2 = "grey";

            decoratedBee.setName("SteelBee" + String.valueOf(count));
            count++;
            System.out.println("construct " + getName());
        } else {
            decoratedBee.setColor1("grey");
        }
    }

    @Override
    public void setSpecies(String sp) {

        decoratedBee.setSpecies(sp);

    }

    @Override
    public String getSpecies() {

        return decoratedBee.getSpecies();
    }

    @Override
    public void setColor1(String clr) {

        decoratedBee.setColor1(clr);
    }

    @Override
    public String getColor1() {

        return decoratedBee.getColor1();
    }

    public void setColor2(String clr) {

        color2 = clr;
    }

    public String getColor2() {

        return color2;
    }

    @Override
    public String getRole() {

        return decoratedBee.getRole();

    }

    @Override
    public void setRole(String rl) {

        decoratedBee.setRole(rl);
    }

    @Override
    public String getName() {

        return decoratedBee.getName();

    }

    @Override
    public void setName(String nm) {

        decoratedBee.setName(nm);

    }

    @Override
    public String getHive() {

        return decoratedBee.getHive();

    }

    @Override
    public void setHive(String hv) {

        decoratedBee.setHive(hv);

    }
}
