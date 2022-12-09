package stream_class;

import java.util.*;
import java.util.stream.Stream;

public class ArrayListStudent {

	String name;
	int marks;
	
	public ArrayListStudent(String name, int marks) {
		super();
		this.name = name;
		this .marks = marks;
	}
	
	
	
	@Override
	public String toString() {
		return "Student Details "+'\n'+"name=" + name + '\n'+"marks=" + marks;
	}

	public static void main(String arg[]) {
		
		List<ArrayListStudent> s = new ArrayList<>();
		s.add(new ArrayListStudent("Amit", 67));
		s.add(new ArrayListStudent("Amrita", 89));
		s.add(new ArrayListStudent("Sumit", 58));
		s.add(new ArrayListStudent("Sachin", 69));
		
		/*
		List<Integer> stu= new ArrayList<>();
		
		for(ArrayListStudent s1:s) {
			if(s1.marks>60) {
				stu.add(s1.marks);
			}
		}
		System.out.println(stu);
		*/
		Stream<Object> stu = s.stream().filter(p->p.marks>60).map(p->p.marks);
		System.out.println(stu);
		
	}
}
