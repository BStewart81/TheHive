package template.java.theHive;

import decorator.java.theHive.BeeDecorator;
import decorator.java.theHive.BrickBeeDecorator;
import decorator.java.theHive.ElectricBeeDecorator;
import decorator.java.theHive.SteelBeeDecorator;
import decorator.java.theHive.WoodBeeDecorator;
import singleton.java.theHive.Apiary;

public class UnevenFight extends BattleTemplate {
  private static String bee1;
  private static String bee1T;
  private static String bee2;
  private static String bee2T;

  @Override
  void fight(BeeDecorator bz1, BeeDecorator bz2) {

    bee1 = bz1.getRole();
    bee1T = bz1.getSpecies();

    bee2 = bz2.getRole();
    bee2T = bz2.getSpecies();

    if (bee1.equals("warrior") && bee2.equals("drone")) {
      decWinner(bz1);
      desLoser(bz2);
    } else if (bee1.equals("warrior") && bee2.equals("queen")) {
      decWinner(bz2);
      desLoser(bz1);
    } else if (bee1.equals("queen")) {
      decWinner(bz1);
      desLoser(bz2);
    } else if (bee1.equals("drone")) {
      decWinner(bz2);
      desLoser(bz1);
    }
  }

  @Override
  void decWinner(BeeDecorator bz1) {

    if (!bz1.getSpecies().equals(bee1T)) {
      bee1T = bee2T;
      bee2T = bz1.getSpecies();
    }

    if (bee2T.equals("brick")) {
      bz1 = new BrickBeeDecorator(bz1);
    } else if (bee2T.equals("steel")) {
      bz1 = new SteelBeeDecorator(bz1);
    } else if (bee2T.equals("electric")) {
      bz1 = new ElectricBeeDecorator(bz1);
    } else {
      bz1 = new WoodBeeDecorator(bz1);
    }

  }

  @Override
  void desLoser(BeeDecorator bz2) {

    if (!bz2.getSpecies().equals(bee2T)) {
      bee2T = bee1T;
      bee1T = bz2.getSpecies();
    }

    Apiary.getHiveList().forEach(HiveInterface -> {
      if (HiveInterface.getName().equals(bz2.getHive())) {
        HiveInterface.deleteBee(bz2);
      }
    });

  }

}
