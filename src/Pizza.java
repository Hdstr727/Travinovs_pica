
public class Pizza {
	private int size;
	private String type;
	private boolean mushrooms = false;
	private boolean cheese = false;
	private boolean tomatoes = false;
	private boolean pickles = false;
	
	
	public Pizza(int size, String type, boolean mushrooms,
			boolean cheese, boolean tomatoes, boolean pickles) {
		this.size = size;
		this.type = type;
		this.mushrooms = mushrooms;
		this.cheese = cheese;
		this.tomatoes = tomatoes; 
		this.pickles = pickles;
		
	}
	
	public void setSize(int cm) {
		this.size = cm;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setType(String pizzaType) {
		this.type = pizzaType;
	}
	
	public String getType() {
		return type;
	}
	
	
	
	
	
	
}
