package stream_class;

import java.util.stream.Stream;

public class StreamClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stream.iterate(1, num->num+3)
			.filter(num -> num%4==0)
			.limit(5)
			.forEach(System.out::println);
	}

}
