package template.java.TheHive;

public abstract class BattleTemplate {
	
	abstract void fight();
	abstract void decWinner();
	abstract void desLoser();
	
	public final void battle() {
		
		fight();
		decWinner();
		desLoser();
	}

}
