package coreJava3;
import java.util.*;

import javax.security.auth.Subject;

public class ArrayTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name="";
		int id=0;
		double total=0;
		String branchName="";
		int sem=0;
		String grade="";
		String[] subNames= {"Java", "Python","Web","C","Cpp","Spring"};
		double[] marks=new double[subNames.length];
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter Id");
		id=sc.nextInt();
		System.out.println("Enter branch");
		branchName=sc.next();
		System.out.println("Enter semester number");
		sem=sc.nextInt();
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter marks for"+" "+subNames[i]);
			marks[i]=sc.nextDouble();
			total=total+marks[i];
		}
		double avg=(total)/(marks.length);
		if(avg>=90 && avg<=100) {
			grade="A++";
		}
		else if(avg>=80 && avg<=89) {
			grade="A+";
		}
		else if(avg>=70 && avg<=79) {
			grade="B++";
		}
		else if(avg>=60 && avg<=69) {
			grade="B+";
		}
		else if(avg>=50 && avg<=59) {
			grade="C";
		}
		else {
			grade="E";
		}
		System.out.println("--------------------------");
		System.out.println("Report Card");
		System.out.println("--------------------------");
		System.out.println("CIT"+"\t"+ "Report Card");
		System.out.println("--------------------------------");
		System.out.println("Name"+name+"\t"+"Stud Id"+id+"\t"+"Branch Name"+branchName+"\t"+"Sem"+sem);
		System.out.println("--------------------------");
		System.out.println("Sr No"+"\t"+"subjects"+"\t"+"Marks");
		for(int i=0;i<subNames.length;i++) {
			System.out.println(i+1+"\t"+ subNames[i]+"\t"+ marks[i]);
		}
		System.out.println("Total"+"\t"+total+"\t"+"Avg"+"\t"+ avg+"\t"+"Grade"+"\t"+grade);
		
		
		
	}

}
