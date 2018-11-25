package mian.java.TheHive;

public class Bee implements BeeInterface{
	
	private String species;
	private String color1;
	
	public Bee() {
		
		species = "";
		color1 = "black";
		
	}

	@Override
	public void setSpecies(String sp) {

		species  = sp;
		
	}

	@Override
	public String getSpecies() {
		
		return species;
	}

	@Override
	public void setColor1(String clr) {

		color1 = clr;
		
	}

	@Override
	public String getColor1() {
		
		return color1;
	}
	
	
	

}
