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
	
	public void setSize (int cm) {
		this.size = cm;
	}
	
	public int getSize () {
		return size;
	}
	
	public void setType (String pizzaType) {
		this.type = pizzaType;
	}
	
	public String getType () {
		return type;
	}

	public void setMushrooms(boolean mushrooms) {
		this.mushrooms = mushrooms;
	}

	public boolean getMushrooms () {
		return mushrooms;
	}

	public void setCheese (boolean cheese) {
		this.cheese = cheese;
	}

	public boolean getCheese () {
		return cheese;
	}

	public void setTomatoes (boolean tomatoes) {
		this.tomatoes = tomatoes;
	}

	public boolean getTomatoes () {
		return tomatoes;
	}

	public void setPickles (boolean pickles) {
		this.pickles = pickles;
	}

	public boolean getPickles () {
		return pickles;
	}
}