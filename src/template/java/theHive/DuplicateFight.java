package template.java.theHive;

import decorator.java.theHive.BeeDecorator;
import singleton.java.theHive.Apiary;

/*************
 * DuplicateBattle Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this is the battle sequence for bees that are the same
 */
public class DuplicateFight extends BattleTemplate {

  @Override
  void fight(BeeDecorator bz1, BeeDecorator bz2) {

    desLoser(bz2);

  }

  @Override
  void decWinner(BeeDecorator bz1) {

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
