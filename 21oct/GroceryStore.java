//WAP to make a grocery store
//import Scanner class
import java.util.Scanner;
//create a class
class GroceryStore{

	//method to choose the vegitable and fruits you want to buy
	static void choicess(float num1, int choice){
		switch(choice){
		case 1:price(num1,100);
			break;
		case 2:price(num1,60);
			break;
		case 3:price(num1,25);
			break;
		case 4:price(num1,100);
			break;
		case 5:price(num1,50);
			break;
		case 6:System.exit(0);
			break;
		default: System.out.println("Wrong input");
		}
	}
	//ends of 

	//method to calculate total bill amount
	static void price(float num1, int qty){
		float total = num1*qty;
		System.out.println("Your total billing amount :- "+total);
		discount(total);
	}
	//ends of method price method


	//method to calculate total bill with discount
	static void discount(float total){
		float discounts;
		if(total>=2000){
			float price = (total/100)*80;
			discounts = 20;
			System.out.println("Discounted price :- "+price);
		}else if(total>=500){
			float price = (total/100)*90;
			discounts = 10;
			System.out.println("Discounted price :- "+price);
		}else if(total>=250){
			float price = (total/100)*95;
			discounts = 5;
			System.out.println("Your total billing amount with discount voucher :- "+price);
		}else
		System.out.println("Sorry you do'nt have any discount voucher");

		System.out.println("Congratulation... You are eligible for "+discounts+"% discount voucher");
	}
	//ends of method discount method

	public static void main(String arg[]){
		//creating Scanner class object
		Scanner sc = new Scanner(System.in);


		//declearing variable
		int choice;
		float qty;

		System.out.println("Welcome to grocery store");
		System.out.println("Press the key according to your choicess");
		System.out.println("1. Apple :- Rs 100/kg");
		System.out.println("2. Tomatos :- Rs 60/kg");
		System.out.println("3. Potato :- Rs 25/kg");
		System.out.println("4. Broccoli :- Rs 100/pices");
		System.out.println("5. Pumpkin :- Rs 50/kg");
		System.out.println("6. Exit");

		//taking input from user choice and quentity he or she want to buy
		System.out.println("Enter your choicess");
		choice = sc.nextInt();
		System.out.println("Enter the quantity you want to purchase");
		qty = sc.nextFloat();

		
		choicess(qty, choice);
	}
	//ends of main method
}
//ends of class