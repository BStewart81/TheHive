package mian.java.TheHive;

public class ElectricBeeDecorator extends BeeDecorator{
	private String color2;
	private Boolean queen;
	private String name;
	private static int count = 0;
	
	
	public ElectricBeeDecorator(BeeInterface decoratedBee) {
		super(decoratedBee);
		
		name = "ElectricBee" + String.valueOf(count);
		color2 = "blue";
		queen = false;
		count++;
		
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
	
	public Boolean getQueen() {
		
		return queen;
		
	}
	
	public void setQueen(int qn) {
		
		if (qn ==1) {
			queen = true;
		}
		else {
			queen = false;
		}
	}

}


