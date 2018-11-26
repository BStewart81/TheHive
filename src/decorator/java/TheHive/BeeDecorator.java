package decorator.java.TheHive;

import builder.java.TheHive.BeeInterface;

public abstract class BeeDecorator implements BeeInterface{
	
	protected BeeInterface decoratedBee;
	
	public BeeDecorator(BeeInterface decoratedBee) {
		this.decoratedBee = decoratedBee;
	}
	
	public void setSpecies(String sp) {
		
		decoratedBee.setSpecies(sp);
		
		}
	
	public String getSpecies() {
		
			return decoratedBee.getSpecies();
		}

	
}
