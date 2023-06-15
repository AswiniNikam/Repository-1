package coreJava3;
import java.util.*;
public class ArrayTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		String[] arr= {"Jan","Feb","March","April","May","June","July","August","Sept","Oct","Nov","Dec"};
		System.out.println("Enter the month number");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		System.out.println("You birthday is in"+" "+ arr[num-1]);
	}

}
