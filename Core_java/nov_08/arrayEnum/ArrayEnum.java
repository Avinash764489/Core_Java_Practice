package arrayEnum;
//declare class
public class ArrayEnum {

	//declare enum
	enum day{sun, mon, tue;};
	enum day1{sun(24), mon(45), tue(56);
		int i;
		day1(int i){
			this.i = i;
		}};
	
	//declare main method
	public static void main(String arg[]) {
		//print enum values using for-each loop
		for(day d:day.values()) {
			System.out.println(d);
		}
		
		//print enum values using for-each loop
		for(day1 d:day1.values()) {
			System.out.println(d+"-"+d.i);
		}
	}
	//end of method
}
//end of class
