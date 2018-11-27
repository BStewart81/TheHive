package decorator.java.TheHive;

import builder.java.TheHive.BeeInterface;

public class BrickBeeDecorator extends BeeDecorator {

	private String color2;
	private String role;
	private String name;
	private String hive;
	
	private static int count = 0;
	
	public BrickBeeDecorator(BeeInterface decoratedBee) {
		super(decoratedBee);
		this.decoratedBee = decoratedBee;
		if (decoratedBee.getName().equals("")) {
		decoratedBee.setSpecies("brick");
		color2 = "red";
		hive = "";
		decoratedBee.setName("BrickBee" + String.valueOf(count));
		count++;
		System.out.println("construct " + name);
	} else {
		decoratedBee.setColor1("red");
	}}

	@Override
	public void setSpecies(String sp) {
		
		decoratedBee.setSpecies(sp);
		
	}

	@Override
	public String getSpecies() {
		
		return decoratedBee.getSpecies();
	}
	
	@Override
	public void setColor1(String clr) {
		
		decoratedBee.setColor1(clr);
	}
	
	@Override
	public String getColor1() {
		
		return  decoratedBee.getColor1();
	}
	
	
	public void setColor2(String clr) {
		
		color2 = clr;
	}
	
	
	public String getColor2() {
		
		return color2;
	}
	
	@Override
	public String getRole() {
		
		return role;
		
	}
	
	@Override
	public void setRole(String rl) {
		
		role = rl;
	}
	
	@Override
	public String getName() {
		
		return name;
		
	}
	
	@Override
	public void setName(String nm) {
		
		name = nm;
		
	}
	
	
	public String getHive() {
		
		return hive;
		
	}
	
	
	public void setHive(String hv) {
		
		name = hv;
		
	}
}
