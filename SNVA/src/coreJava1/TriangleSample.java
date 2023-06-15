package coreJava1;
import java.util.*;

public class TriangleSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int side1=0, side2=0, side3=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter side1");
		side1=sc.nextInt();
		System.out.println("Enter side2");
		side2=sc.nextInt();
		System.out.println("Enter side3");
		side3=sc.nextInt();
		if(side1==side2 && side1==side3) {
			System.out.println("Equilateral triangle");
		}
		else if(side1==side2 && side1!=side3 && side2!=side3) {
			System.out.println("Isosceles triangle");
		}else {

			System.out.println("Scalene triangle");
			
		 
		}

	}

}
