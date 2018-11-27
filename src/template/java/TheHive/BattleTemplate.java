package template.java.TheHive;

import decorator.java.TheHive.BeeDecorator;

public abstract class BattleTemplate {
	
	abstract void fight(BeeDecorator bz1, BeeDecorator bz2);
	abstract void decWinner(BeeDecorator bz1);
	abstract void desLoser(BeeDecorator bz2);
	
	public final void battle(BeeDecorator bz1, BeeDecorator bz2) {
		
		fight(bz1, bz2);
		decWinner(bz1);
		desLoser(bz2);
	}
}