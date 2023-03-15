
public class Pizza {
	private int size;
	private String type;
	private String topping;
	
	public Pizza(int size, String type, String topping) {
		this.size = size;
		this.type = type;
		this.topping = topping;
	}
	
	public void setSize(int cm) {
		size = cm;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setType(String pizzaType) {
		type = pizzaType;
	}
	
	public String getType() {
		return type;
	}
	
	public void setTopping(String pizzaTopping) {
		topping = pizzaTopping;
	}
	
	public String getTopping() {
		return topping;
	}
}
