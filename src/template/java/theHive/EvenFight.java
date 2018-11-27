package template.java.theHive;

import decorator.java.theHive.BeeDecorator;
import decorator.java.theHive.BrickBeeDecorator;
import decorator.java.theHive.ElectricBeeDecorator;
import decorator.java.theHive.SteelBeeDecorator;
import decorator.java.theHive.WoodBeeDecorator;
import singleton.java.theHive.Apiary;

/*************
 * EvenBattle Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this is the battle sequence for bees that are the same type
 */

public class EvenFight extends BattleTemplate {

  private static String bee1;
  private static String bee2;

  @Override
  void fight(BeeDecorator bz1, BeeDecorator bz2) {

    bee1 = bz1.getSpecies();
    bee2 = bz2.getSpecies();

    if (bee1.equals("electric") && (bee2.equals("wood") || bee2.equals("steel"))) {
      decWinner(bz1);
      desLoser(bz2);
    } else if (bee1.equals("electric") && bee2.equals("brick")) {
      decWinner(bz2);
      desLoser(bz1);
    } else if (bee1.equals("wood") && (bee2.equals("steel") || bee2.equals("brick"))) {
      decWinner(bz1);
      desLoser(bz2);
    } else if (bee1.equals("wood") && bee2.equals("electric")) {
      decWinner(bz2);
      desLoser(bz1);
    } else if (bee1.equals("steel") && (bee2.equals("electric") || bee2.equals("brick"))) {
      decWinner(bz1);
      desLoser(bz2);
    } else if (bee1.equals("steel") && bee2.equals("wood")) {
      decWinner(bz2);
      desLoser(bz1);
    }
    if (bee1.equals("brick") && (bee2.equals("electric") || bee2.equals("wood"))) {
      decWinner(bz1);
      desLoser(bz2);
    } else if (bee1.equals("brick") && bee2.equals("steel")) {
      decWinner(bz2);
      desLoser(bz1);
    }
  }

  @Override
  void decWinner(BeeDecorator bz1) {

    if (bee2.equals("brick")) {
      bz1 = new BrickBeeDecorator(bz1);
    } else if (bee2.equals("steel")) {
      bz1 = new SteelBeeDecorator(bz1);
    } else if (bee2.equals("electric")) {
      bz1 = new ElectricBeeDecorator(bz1);
    } else {
      bz1 = new WoodBeeDecorator(bz1);
    }

  }

  @Override
  void desLoser(BeeDecorator bz2) {

    Apiary.getHiveList().forEach(HiveInterface -> {
      if (HiveInterface.getName().equals(bz2.getHive())) {
        HiveInterface.deleteBee(bz2);
      }
    });

  }

}
