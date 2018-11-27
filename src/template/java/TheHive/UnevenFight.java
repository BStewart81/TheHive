package template.java.TheHive;

import decorator.java.TheHive.BeeDecorator;
import decorator.java.TheHive.BrickBeeDecorator;
import decorator.java.TheHive.ElectricBeeDecorator;
import decorator.java.TheHive.SteelBeeDecorator;
import decorator.java.TheHive.WoodBeeDecorator;
import singleton.java.TheHive.Apiary;

public class UnevenFight extends BattleTemplate{
	private static String bee1;
	private static String bee2;
	
	@Override
	void fight(BeeDecorator bz1, BeeDecorator bz2) {
		
		bee1 = bz1.getRole();
		bee2 = bz2.getRole();
		
		if (bee1.equals("warrior") && bee2.equals("drone")) {
			decWinner(bz1);
			desLoser(bz2);
		} else if (bee1.equals("warrior") && bee2.equals("queen") ) {
			decWinner(bz2);
			desLoser(bz1);
		} else if (bee1.equals("queen")) {
			decWinner(bz1);
			desLoser(bz2);
		} else if (bee1.equals("drone")){
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
