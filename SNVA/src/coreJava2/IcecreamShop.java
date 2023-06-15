package coreJava2;

import java.util.Scanner;

public class IcecreamShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  choice;
		String ans="y";
		int vanillaqty=0;
		int chocolateqty=0;
		int butterscotchqty=0;
		int mangoqty=0;
		int dbsqty=0;
		double price=0;
		double vanillaPrice=3;
		double chocolatePrice=2;
		double butterscotchPrice=1.5;
		double mangoPrice=3;
		double DBSPrice=2;
		int verieties=0;
		double vanillaAmount=0;
		double chocolateAmount=0;
		double butterscotchAmount=0;
		double mangoAmount=0;
		double DBSAmount=0;
		boolean chocolateFlag=false;
		boolean vanillaFlag=false;
		boolean butterscotchFlag=false;
		boolean mangoFlag=false;
		boolean dbsFlag=false;
		double total=0;
		int qty=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Ice Cream Shop---------");
		System.out.println("How are you?");
		ans=sc.next();
		System.out.println("What's your name");
		ans=sc.next();
		System.out.println("Hello Ashwini place your order");
		do {
		System.out.println("Enter your choice");
		System.out.println("Menu");
		System.out.println("1. Scoops\n" + "2.Exquisite\n" + "Enter selection: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("1. Vanilla\n" + "2.Chocolate\n" +"3.Butterscotch\n"+ "Enter selection: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				vanillaFlag=true;
				verieties=verieties+1;
				System.out.println("How many icecreams");
				qty=sc.nextInt();
				vanillaqty=vanillaqty+qty;
				
				vanillaAmount=vanillaAmount+(qty*vanillaPrice);
				qty=0;
				System.out.println(vanillaAmount);
				break;
			case 2:
				chocolateFlag=true;
				verieties=verieties+1;
				System.out.println("How many icecreams");
				qty=sc.nextInt();
				chocolateqty=chocolateqty+qty;
				
				chocolateAmount=chocolateAmount+(qty*chocolatePrice);
				qty=0;
				System.out.println(chocolateAmount);
				break;
			case 3: 
				butterscotchFlag=true;
				verieties=verieties+1;
				System.out.println("How many icecreams");
				qty=sc.nextInt();
				butterscotchqty=butterscotchqty+qty;
				butterscotchAmount=butterscotchAmount+(qty*butterscotchPrice);
				qty=0;
				System.out.println(butterscotchAmount);
				break;
			}
			break;
		case 2:
			System.out.println("1. Mango\n" + "2.DBC\n");
			choice=sc.nextInt();
			switch(choice) {
			case 1: 
				mangoFlag=true;
				verieties=verieties+1;
				System.out.println("How many icecreams?");
				qty=sc.nextInt();
				mangoqty=mangoqty+qty;
				mangoAmount=mangoAmount+(qty*mangoPrice);
				qty=0;
				System.out.println(mangoAmount);
				break;
			case 2: 
				dbsFlag=true;
				verieties=verieties+1;
				System.out.println("How many incecreams?");
				qty=sc.nextInt();
				dbsqty=dbsqty+qty;
				DBSAmount=DBSAmount+(qty*DBSPrice);
				qty=0;
				System.out.println(DBSAmount);
				break;
			}
			break;
		
		}System.out.println("Do you want to continue");
		ans=sc.next();
		}while(ans.equals("y"));
		System.out.println("Bill"); 
		System.out.println("Sl No."+"\t"+" "+ "Flavour" +"\t"+" "+"\t"+"Price"+"\t"+" "+"Quantity"+"\t"+" "+"Amount");
		
			if(vanillaFlag) {
				System.out.println("\t"+" "+"Vanilla"+"\t"+" "+"\t"+vanillaPrice+"\t"+" "+"\t"+vanillaqty+ " "+"\t"+vanillaAmount);
			}
			 if(chocolateFlag) {
				System.out.println("\t"+" "+"Chocolate"+"\t"+" "+chocolatePrice+"\t"+" "+"\t"+chocolateqty+ " "+"\t"+chocolateAmount);
			}
			 if(butterscotchFlag) {
				System.out.println(" "+"\t"+"Butterscotch"+"\t"+" "+butterscotchPrice+"\t"+" "+butterscotchqty+ " "+"\t"+butterscotchAmount);
			}
			 if(mangoFlag) {
				System.out.println(" "+"\t"+"Mango"+"\t"+" "+mangoPrice+"\t"+" "+mangoqty+ " "+"\t"+mangoAmount);
			}
			 if(dbsFlag) {
				System.out.println(" "+"\t"+"DBS"+"\t"+" "+"\t"+DBSPrice+"\t"+" "+"\t"+dbsqty+ " "+"\t"+DBSAmount);
			}
		
		total=total+DBSAmount+mangoAmount+butterscotchAmount+chocolateAmount+vanillaAmount;
		System.out.println("Total"+" "+total);
		
		
	}
	
}


