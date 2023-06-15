package coreJava1;
import java.util.*;

public class BakeryShop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  choice;
		String ans="y";
		int qty=0;
		double price=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("Enter your choice");
		System.out.println("Menu");
		System.out.println("1. backCurrent");
		System.out.println("2. whiteForest");
		System.out.println("3. chocolate");
		System.out.println("4. redVelvet");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter qty");
			qty=sc.nextInt();
			price=calPrice(qty,0.5,price);
			break;
		case 2:
			System.out.println("Enter qty");
			qty=sc.nextInt();
			price=calPrice(qty,0.3,price);
			break;
		case 3:
			System.out.println("Enter qty");
			qty=sc.nextInt();
			price=calPrice(qty,4,price);
			break;
		case 4:
			System.out.println("Enter qty");
			qty=sc.nextInt();
			price=calPrice(qty,4.5,price);
			break;
		}System.out.println("Do you want to continue");
		ans=sc.next();
		}while(ans.equals("y"));
		System.out.println("Price is"+price);
		
	}
	public static double calPrice(int qty, double rate, double price) {
		price= price+(qty*rate);
		return price;
	}

}
