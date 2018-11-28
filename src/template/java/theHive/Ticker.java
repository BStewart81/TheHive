package template.java.theHive;

import decorator.java.theHive.BeeDecorator;
import singleton.java.theHive.Apiary;

import java.util.Vector;

/*************
 * TickerClass.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this class runs the battles and everything else through the passage
 *          of "time"
 */

public class Ticker {

    private static int beeCount;
    private static int portion;
    private int hiveRndm;
    private int beeRndm;
    private Vector<BeeDecorator> fighters;
    private Vector<BeeDecorator> workers;
    private EvenFight even;
    private UnevenFight uneven;
    private DuplicateFight duplicate;
    private Boolean check;

    /************
     * creates a tick wich in a unit of "time".
     */
    public void tick() {

        portion = 0;
        portion = getBeeCount() / 3;

        fighters = new Vector<BeeDecorator>();
        workers = new Vector<BeeDecorator>();
        ;
        System.out.println("CHECK 1");
        makeFightList();
        makeWorkList();
        System.out.println("CHECK 2");
        runFights();
        System.out.println("CHECK 3");

        while (checkForZero()) {
            checkForZero();
        }

        System.out.println("CHECK 4");
    }

    /***********
     * makes a vector of the bees that will fight this tick.
     */
    public void makeFightList() {

        if (getBeeCount() > 10) {
            for (int i = 0; i < portion; i++) {

                hiveRndm = (int) ((Math.random() * Apiary.getHiveList().size()));

                beeRndm = (int) ((Math.random()
                        * Apiary.getHiveList().get(hiveRndm).getBees().size()));

                if (!fighters.contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))
                        && !workers.contains(
                                Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))) {

                    fighters.add(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm));

                } else {
                    i--;
                }
            }
        } else {
            Apiary.getHiveList().forEach(HiveInterface -> {
                HiveInterface.getBees().forEach(BeeDecorator -> {
                    fighters.add(BeeDecorator);
                });
            });
        }
    }

    /***************
     * makes a vector of the bees that will work this tick.
     */
    public void makeWorkList() {

        for (int i = 0; i < portion; i++) {

            hiveRndm = (int) ((Math.random() * Apiary.getHiveList().size()));
            beeRndm = (int) ((Math.random() * Apiary.getHiveList().get(hiveRndm).getBees().size()));

            if (!fighters.contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))
                    && !workers
                            .contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))) {

                workers.add(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm));

            } else {
                i--;
            }
        }
    }

    /**************
     * gets a current count of the bees in the apiary.
     * 
     * @return the number of bees
     */
    public int getBeeCount() {
        beeCount = 0;
        Apiary.getHiveList().forEach(HiveInterface -> {
            beeCount = beeCount + HiveInterface.getBees().size();
        });
        return beeCount;
    }

    /*******************
     * sets the matchups for the battles.
     */
    public void runFights() {
        even = new EvenFight();
        uneven = new UnevenFight();
        duplicate = new DuplicateFight();

        for (int j = 0; j < (portion / 2); j++) {
            if (fighters.get(j * 2).getRole().equals(fighters.get((j * 2) + 1).getRole())) {

                if (fighters.get(j * 2).getSpecies()
                        .equals(fighters.get((j * 2) + 1).getSpecies())) {
                    duplicate.fight(fighters.get(j * 2), fighters.get((j * 2) + 1));
                } else {
                    even.fight(fighters.get(j * 2), fighters.get((j * 2) + 1));
                }
            } else {
                uneven.fight(fighters.get(j * 2), fighters.get((j * 2) + 1));
            }
        }
    }

    /*****************
     * checking to see if there are any empty hives.
     * 
     * @return a boolean value of wether there were zeros or not
     */
    public Boolean checkForZero() {

        check = false;

        for (int p = 0; p < Apiary.getHiveList().size(); p++) {

            if (Apiary.getHiveList().get(p).getBees().size() == 0) {
                Apiary.removeFromHiveList(Apiary.getHiveList().get(p));
                check = true;
                return check;
            }
        }
        return check;
    }
}
