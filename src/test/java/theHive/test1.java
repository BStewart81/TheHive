package test.java.theHive;

import static org.junit.Assert.assertTrue;

import builder.java.theHive.BrickHive;
import builder.java.theHive.ElectricHive;
import builder.java.theHive.SteelHive;
import builder.java.theHive.WoodHive;
import singleton.java.theHive.Apiary;
import template.java.theHive.DuplicateFight;
import template.java.theHive.EvenFight;
import template.java.theHive.Ticker;
import template.java.theHive.UnevenFight;

import org.junit.Test;

public class test1 {

  @Test
  public void test() {

    Apiary.addToHiveList(new BrickHive());
    Apiary.addToHiveList(new SteelHive());
    Apiary.addToHiveList(new ElectricHive());
    Apiary.addToHiveList(new WoodHive());

    assertTrue(Apiary.getHiveList().size() == 4);

    Ticker tick = new Ticker();
    assertTrue(tick.getBeeCount() == 200);

    EvenFight even = new EvenFight();
    even.battle(Apiary.getHiveList().get(0).getBees().get(0), Apiary.getHiveList().get(1).getBees().get(0));
    assertTrue(Apiary.getHiveList().get(1).getBees().get(0).getColor1().equals("red"));
    assertTrue(Apiary.getHiveList().get(0).getBees().size() == 49);

    even.battle(Apiary.getHiveList().get(2).getBees().get(0), Apiary.getHiveList().get(3).getBees().get(0));
    assertTrue(Apiary.getHiveList().get(2).getBees().get(0).getColor1().equals("brown"));
    assertTrue(Apiary.getHiveList().get(3).getBees().size() == 49);

    DuplicateFight dupe = new DuplicateFight();
    dupe.battle(Apiary.getHiveList().get(0).getBees().get(10), Apiary.getHiveList().get(0).getBees().get(11));
    assertTrue(Apiary.getHiveList().get(0).getBees().get(10).getColor1().equals("black"));
    assertTrue(Apiary.getHiveList().get(0).getBees().size() == 48);

    UnevenFight uneven = new UnevenFight();
    uneven.battle(Apiary.getHiveList().get(2).getBees().get(10), Apiary.getHiveList().get(1).getBees().get(40));
    assertTrue(Apiary.getHiveList().get(2).getBees().get(10).getColor1().equals("grey"));
    assertTrue(Apiary.getHiveList().get(1).getBees().size() == 49);

    uneven.battle(Apiary.getHiveList().get(3).getBees().get(1), Apiary.getHiveList().get(1).getBees().get(10));
    assertTrue(Apiary.getHiveList().get(3).getBees().get(1).getColor1().equals("grey"));
    assertTrue(Apiary.getHiveList().get(1).getBees().size() == 48);

    assertTrue(!tick.checkForZero());

    Apiary.removeFromHiveList(Apiary.getHiveList().get(2));

    assertTrue(Apiary.getHiveList().size() == 3);

  }

}
