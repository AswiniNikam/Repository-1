package coreJava1;
import java.util.Scanner;

public class UserInput1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		String name;
		int age;
		float height;
		System.out.println("Enter name, age, and height");
		name=sc.next();
		age=sc.nextInt();
		height=sc.nextFloat();
		System.out.println(name+" "+" "+age+" "+height);
		sc.close();
		
	}

}
