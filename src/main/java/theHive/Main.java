package main.java.theHive;

import builder.java.theHive.Builder;
import singleton.java.theHive.Apiary;
import template.java.theHive.Ticker;

/*************
 * Main Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class runs the program
 */

public class Main {
  /************
   * the main method to work the program.
   * 
   * @param args are arguments you want to give
   */
  public static void main(String[] args) {

    Apiary.getInstance();
    Builder build = new Builder();
    build.buildApiary();

    Ticker ticker = new Ticker();
    int count = 0;

    while (Apiary.getHiveList().size() > 1 && count <= 10) {

      System.out.println("********* TICK " + count + " *************");
      System.out.println("starting bee count: " + ticker.getBeeCount());
      ticker.tick();
      count++;
      Apiary.getHiveList().forEach(HiveInterface -> {
        System.out.println(HiveInterface.getName() + " total: " + HiveInterface.getBees().size());
      });
    }

    System.out.println("done");

  }

}
