package main.java.TheHive;

import singleton.java.TheHive.Apiary;

public class Main {

	public static void main(String[] args) {

		Apiary.getInstance();
		Apiary.printHives();
		System.out.println("done");

	}

}
