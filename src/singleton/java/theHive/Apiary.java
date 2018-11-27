package singleton.java.theHive;

import java.util.Vector;

import builder.java.theHive.HiveInterface;

/*************
 * Apiary Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this is a Singleton class that creates an Apiary
 */

public class Apiary {

  private static final Apiary INSTANCE = new Apiary();

  private static Vector<HiveInterface> HiveList;

  /*************
   * creates an apiary.
   */
  private Apiary() {

    HiveList = new Vector<HiveInterface>();
    System.out.println("*******NEW APIARY CREATED******");

  }

  /*************
   * returns the single Apiary instance.
   * 
   * @return the instance of the apiary
   */
  public static Apiary getInstance() {
    return INSTANCE;
  }

  /*************
   * returns the single Apiary's HiveList.
   * 
   * @return a vector of the hives
   */
  public static Vector<HiveInterface> getHiveList() {

    return HiveList;
  }

  /*************
   * adds given Hive to HiveList.
   * 
   * @param hv the hive you want to add
   */
  public static void addToHiveList(HiveInterface hv) {

    HiveList.add(hv);

  }

  /*************
   * removes given Hive from HiveList.
   * 
   * @param hv hive you want to remove
   */
  public static void removeFromHiveList(HiveInterface hv) {

    HiveList.remove(hv);

  }
}
