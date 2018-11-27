package template.java.TheHive;

import decorator.java.TheHive.BeeDecorator;

import singleton.java.TheHive.Apiary;

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

		Apiary.getHiveList().forEach(HiveInterface->{
			if(HiveInterface.getName().equals(bz2.getHive())) {
				HiveInterface.deleteBee(bz2);
			}
		});
		
	}
	

}
