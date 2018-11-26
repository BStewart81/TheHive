package builder.java.TheHive;

public class Bee implements BeeInterface{
	
	private String species;
	private String color1;
	private String name;
	private Boolean queen;
	
	public Bee() {
		
		species = "";
		color1 = "black";
		name = "";
		queen = false;
		
	}

	@Override
	public void setSpecies(String sp) {
		
		species = sp;
		
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
		
		return  color1;
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
