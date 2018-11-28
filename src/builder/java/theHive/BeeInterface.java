package builder.java.theHive;

/*************
 * Bee Interface.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class is the interface to build all bees
 */

public interface BeeInterface {

    public void setSpecies(String sp);

    public String getSpecies();

    public void setColor1(String clr);

    public String getColor1();

    public String getName();

    public void setName(String nm);

    public void setRole(String rl);

    public String getRole();

    public String getHive();

    public void setHive(String hv);
}
