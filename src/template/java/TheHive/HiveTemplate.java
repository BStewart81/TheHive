package template.java.TheHive;

public abstract class HiveTemplate {

	abstract void buildHive();
	abstract void populateHive();
	
	public final void createHive() {
		
		buildHive();
		populateHive();
	}
}
