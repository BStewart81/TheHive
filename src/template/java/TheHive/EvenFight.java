package template.java.TheHive;


import decorator.java.TheHive.BeeDecorator;
import decorator.java.TheHive.BrickBeeDecorator;
import decorator.java.TheHive.ElectricBeeDecorator;
import decorator.java.TheHive.SteelBeeDecorator;
import decorator.java.TheHive.WoodBeeDecorator;
import singleton.java.TheHive.Apiary;

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
		} else if (bee1.equals("electric") && bee2.equals("brick") ) {
			decWinner(bz2);
			desLoser(bz1);
		} else if (bee1.equals("wood") && (bee2.equals("steel") || bee2.equals("brick"))) {
			decWinner(bz1);
			desLoser(bz2);
		} else if (bee1.equals("wood") && bee2.equals("electric") ) {
			decWinner(bz2);
			desLoser(bz1);
		} else if (bee1.equals("steel") && (bee2.equals("electric") || bee2.equals("brick"))) {
			decWinner(bz1);
			desLoser(bz2);
		} else if (bee1.equals("steel") && bee2.equals("wood") ) {
			decWinner(bz2);
			desLoser(bz1);
		} if (bee1.equals("brick") && (bee2.equals("electric") || bee2.equals("wood"))) {
			decWinner(bz1);
			desLoser(bz2);
		} else if (bee1.equals("brick") && bee2.equals("steel") ) {
			decWinner(bz2);
			desLoser(bz1);
		}
	}

	

	@Override
	void decWinner(BeeDecorator bz1) {
		
		if(bee2.equals("brick")) {
			bz1 = new BrickBeeDecorator(bz1);
		} else if(bee2.equals("steel")) {
			bz1 = new SteelBeeDecorator(bz1);
		} else if(bee2.equals("electric")) {
			bz1 = new ElectricBeeDecorator(bz1);
		} else {
			bz1 = new WoodBeeDecorator(bz1);
		}
		
	}

	@Override
	void desLoser(BeeDecorator bz2) {

		Apiary.getHiveList().forEach(HiveInterface->{
			if(HiveInterface.getName().equals(bz2.getHive())) {
				HiveInterface.deleteBee(bz2);
			}
		});
		
	}
	
	

}
