package template.java.TheHive;

import java.util.Vector;

import builder.java.TheHive.Bee;
import builder.java.TheHive.BeeInterface;
import decorator.java.TheHive.BeeDecorator;
import singleton.java.TheHive.Apiary;

public class Ticker {

	private static int beeCount;
	private static int portion;
	private int hiveRndm;
	private int beeRndm;
	private Vector<BeeDecorator> fighters;
	private Vector<BeeDecorator> workers;
	EvenFight even;
	UnevenFight uneven;
	DuplicateFight duplicate;
	
	public void tick() {
		
		portion = 0;
		portion = getBeeCount()/3;
		
		 fighters = new Vector<BeeDecorator>();
		 workers = new Vector<BeeDecorator>();;
		 
		makeFightList();
		makeWorkList();
		
		runFights();
		
		
	}
	
	
	
	public void makeFightList() {
		
		for(int i = 0 ; i < portion; i++) {
		
			hiveRndm = (int)((Math.random() * Apiary.getHiveList().size()));
			beeRndm = (int)((Math.random() * Apiary.getHiveList().get(hiveRndm).getBees().size()));
			
			if (!fighters.contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))
					&& !workers.contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))) {
			
			fighters.add(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm));
			
			} else {
				i--;
			}
		}
	}
	
    public void makeWorkList() {
		
		for(int i = 0 ; i < portion; i++) {
		
			hiveRndm = (int)((Math.random() * Apiary.getHiveList().size()));
			beeRndm = (int)((Math.random() * Apiary.getHiveList().get(hiveRndm).getBees().size()));
			

			if (!fighters.contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))
					&& !workers.contains(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm))) {
			
			workers.add(Apiary.getHiveList().get(hiveRndm).getBees().get(beeRndm));
			
			} else {
				i--;
			}
		}
	}
	
	
	
	public int getBeeCount() {
		beeCount = 0;
		Apiary.getHiveList().forEach(HiveInterface->{
			beeCount = beeCount + HiveInterface.getBees().size();
		});
		return beeCount;
	}
	
	public void runFights() {
		even = new EvenFight();
		uneven = new UnevenFight();
		duplicate = new DuplicateFight();
		
		for(int j = 0; j < (portion/2); j++) {
			if(fighters.get(j * 2).getRole().equals( fighters.get((j * 2)+1).getRole())) {
				
				if(fighters.get(j * 2).getSpecies().equals( fighters.get((j * 2)+1).getSpecies())) {
					duplicate.fight(fighters.get(j * 2), fighters.get((j * 2)+1));
				} else {
					even.fight(fighters.get(j * 2), fighters.get((j * 2)+1));
				}
			} else {
				uneven.fight(fighters.get(j * 2), fighters.get((j * 2)+1));
			}
		}
	}
}
