package main.java.TheHive;

import builder.java.TheHive.Builder;
import singleton.java.TheHive.Apiary;

public class Main {

	public static void main(String[] args) {

		Apiary.getInstance();
		Builder build = new Builder();
		build.buildApiary();
		
		System.out.println("done");

	}

}
