package template.java.theHive;

import decorator.java.theHive.BeeDecorator;

/*************
 * Battle Class.
 * 
 * @author Brandon Stewart
 * @version 26Nov18
 * 
 *          this is the template for the battle sequence
 */

public abstract class BattleTemplate {

    abstract void fight(BeeDecorator bz1, BeeDecorator bz2);

    abstract void decWinner(BeeDecorator bz1);

    abstract void desLoser(BeeDecorator bz2);

    /*************
     * the template for the battle sequence.
     * 
     * @param bz1 the first bee in the fight
     * @param bz2 the second bee in the fight
     */
    public final void battle(BeeDecorator bz1, BeeDecorator bz2) {

        fight(bz1, bz2);

    }
}