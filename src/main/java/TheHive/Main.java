package main.java.TheHive;

import builder.java.TheHive.Builder;
import singleton.java.TheHive.Apiary;
import template.java.TheHive.Ticker;

public class Main {

	public static void main(String[] args) {

		Apiary.getInstance();
		Builder build = new Builder();
		build.buildApiary();
		
		Ticker ticker = new Ticker();
		int count = 0;
		
		while (Apiary.getHiveList().size() > 1 && count <= 1000) {
			
			System.out.println("********* TICK " + count + " *************");
			System.out.println("starting bee count: " + ticker.getBeeCount());
			ticker.tick();
			count++;
		}
		
		System.out.println("done");

	}

}
