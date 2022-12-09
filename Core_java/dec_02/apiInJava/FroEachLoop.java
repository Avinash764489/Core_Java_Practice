package apiInJava;

import java.util.ArrayList;
import java.util.function.Consumer;

public class FroEachLoop {

	public static void main(String arg[]) {
		ArrayList<Integer> al  = new ArrayList<>();
		
		al.add(100);
		al.add(98);
		al.add(300);
		al.add(467);
		al.add(4578);
		al.forEach(new Consumer<Object>(){
			public void accept(Object t) {
				System.out.println(t);
			}
		});
	}
}
