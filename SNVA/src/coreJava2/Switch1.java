package coreJava2;
import java.util.*;

public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Jan");
		System.out.println("2.Feb");
		System.out.println("3.Mar");
		System.out.println("4.Apr");
		System.out.println("5.May");
		System.out.println("6.Jun");
		System.out.println("7.Jul");
		System.out.println("8.Aug");
		System.out.println("9.Sept");
		int month=sc.nextInt();
		String season="";
		switch(month) {
		case 1: 
			season="winter";
			break;
		case 2:
			
			break;
		}
		System.out.println(season);
		
	}

}
