package decorator.java.TheHive;

import builder.java.TheHive.BeeInterface;

public class WoodBeeDecorator extends BeeDecorator {
	private String color2;
	private Boolean queen;
	private String name;
	private static int count;
	
	public WoodBeeDecorator(BeeInterface decoratedBee) {
		super(decoratedBee);
		
		name = "WoodBee" + String.valueOf(count);
		color2 = "grey";
		queen = false;
		count++;
		System.out.println("construct " + name);
	}

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
	public Boolean getQueen() {
		
		return queen;
		
	}
	
	@Override
	public void setQueen(int qn) {
		
		if (qn ==1) {
			queen = true;
		}
		else {
			queen = false;
		}
	}
	
	@Override
	public String getName() {
		
		return name;
		
	}
	
	@Override
	public void setName(String nm) {
		
		name = nm;
		
	}

}

