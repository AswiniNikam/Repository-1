package coreJava2;

import java.util.Scanner;

public class TopicSlectionNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Topic Names");
		System.out.println("1.Java script");
		System.out.println("2.Java");
		System.out.println("3.RDBMS");
		int ch=0;
		System.out.println("Enter your choice");
		ch=sc.nextInt();
		switch(ch) {
		case 1: 
			System.out.println("Topic Names");
			System.out.println("1.Java script variables");
			System.out.println("2.ES6");
			System.out.println("3.Promices");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("You have selected Java script as topic and variables as sub topic");
			break;
			case 2: 
				System.out.println("You have selected Java script as topic and ES6 as sub topic");
			break;
			case 3: 
				System.out.println("You have selected Java script as topic and promices as sub topic");
			break;
			}
		
			
		break;
		case 2: 
			System.out.println("Topic Names");
			System.out.println("1.Core Java");
			System.out.println("2.Multithreading");
			System.out.println("3.Swing");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("You have selected Java as topic and core Java as sub topic");
			break;
			case 2: 
				System.out.println("You have selected Java as topic and Multithrading as sub topic");
			break;
			case 3: 
				System.out.println("You have selected Java as topic and Swing as sub topic");
			break;
			}
		
			break;
		case 3: 
			System.out.println("Topic Names");
			System.out.println("1. SQL");
			System.out.println("2.Oracle");
			System.out.println("3.MySQL");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch) {
			case 1: 
				System.out.println("You have selected RDBMS as topic and SQL as sub topic");
			break;
			case 2: 
				System.out.println("You have selected RDBMS as topic and Oracle as sub topic");
			break;
			case 3: 
				System.out.println("You have selected RDBMS as topic and MySQL as sub topic");
			break;
			}
		
			break;
		default:
			System.out.println("Enterd subject which is in list");
		}
	}

}
