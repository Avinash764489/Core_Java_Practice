import java.util.Scanner;
class InformationScanner{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = sc.nextLine();
		System.out.println("Enter Age");
		int age = sc.nextInt();
		System.out.println("Enter sem1 marks in float");
		float sem1 = sc.nextFloat();
		System.out.println("Enter sem2 marks in double");
		double sem2 = sc.nextDouble();
		System.out.println("Enter true or false");
		boolean pass = sc.nextboolean();
		System.out.println("Enter Gender(M or F)");
		char gender = sc.nextChar().charAt(0);

		System.out.println("Name :- "+name);
		System.out.println("Age :- "+age);
		System.out.println("Gender :- "+gender);
		System.out.println("Sem1 Marks :- "+sem1);
		System.out.println("Sem2 Marks :- "+sem2);
		System.out.println("Pass :- "+pass);
	}
}