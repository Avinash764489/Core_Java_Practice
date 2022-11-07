package abstractEx;

public abstract class AbstractClass {
	private String ac, fridge, type;
	private int area;
	
	abstract void content();
	
	
	public void room(String type,String ac, String fridge) {
		this.type = type;
		this.ac = ac;
		this.fridge = fridge;
		this.area = 3456;
	}


	@Override
	public String toString() {
		return "ac=" + ac + ","+'\n'+"fridge=" + fridge + ","+'\n'+"type=" + type + ","+'\n'+"area=" + area;
	}
	
	
}
