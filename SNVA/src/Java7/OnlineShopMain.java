package core.Java7;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OnlineShopMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int  choice;
		String ans="";
		int qty=0;
		int srNo=1;
		double total=0;
		Map<String, Object> map=new HashMap<>();
		Map<String, Integer> qtyMap=new HashMap<>(); 
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("-------Welcome to Shop---------");
		System.out.println("How are you doing?");
		ans=sc.next();
		System.out.println("Enter your name");
		ans=sc.next();
		User user=new User(3000, ans);
		System.out.println("Hello"+" "+ans+" "+"place your order");
		do {
		System.out.println("Enter your choice");
		System.out.println("Menu");
		System.out.println("1. Laptops\n" + "2.Mouse\n" + "3. Keyboard\n"+"4.WebCam\n"+"5.HeadSet\n"+"6.Cooling pad\n"+"7.HDMI\n"+"8.USB Cables\n"+"Enter selection: ");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Available Laptos");
			System.out.println("1.Mac \n"+ "2.Hp \n"+ "Enter selection: ");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				do {
				System.out.println("1.Mac book Pro\t"+"1000\n"+ "2.MacBook Air \t"+"20000\n"+ "Enter selection: ");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
				MacBookPro laptopPro=new MacBookPro(1000,"MacBookPro");
				map.put("Mac Book Pro",laptopPro);
				System.out.println("Enter quatity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("Mac Book Pro")) {
					qtyMap.put("Mac Book Pro", qtyMap.get("Mac Book Pro")+qty);
				}else {
					qtyMap.put("Mac Book Pro", qty);
				}
				generateBill(qtyMap,map,user);
				break;
				case 2:
				MacBookAir laptopAir=new MacBookAir(2000,"MacBookAir");
				map.put("Mac Book Air",laptopAir);
				System.out.println("Enter quatity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("Mac Book Air")) {
					qtyMap.put("Mac Book Air", qtyMap.get("Mac Book Air")+qty);
				}else {
					qtyMap.put("Mac Book Air", qty);
				}
				generateBill(qtyMap,map,user);
				break;
				}
				System.out.println("Do you want to continue");
				ans=sc.next();
				}while(ans.equals("y")||ans.equals("Y"));
				
			case 2:
				do {
				System.out.println("1. HP I7 \t"+"1000\n"+ "2.HP I5 \t"+"700\n"+"3. HP I3 \t"+"600\n");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					HP7 hp7=new HP7(100,"HP I7");
					map.put("HP I7",hp7);
					System.out.println("Enter quatity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("HP I7")) {
						qtyMap.put("HP I7", qtyMap.get("HP I7")+qty);
					}else {
						qtyMap.put("HP I7", qty);
					}
					generateBill(qtyMap,map,user);
					break;
				case 2:
					HP5 hp5=new HP5(1000,"HP I5");
					map.put("HP I5",hp5);
					System.out.println("Enter quatity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("HP I5")) {
						qtyMap.put("HP I5", qtyMap.get("HP I5")+qty);
					}else {
						qtyMap.put("HP I5", qty);
					}
					generateBill(qtyMap,map,user);
					break;
				case 3:
					HP3 hp3=new HP3(1000,"HP I3");
					map.put("HP I3",hp3);
					System.out.println("Enter quatity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("HP I3")) {
						qtyMap.put("HP I3", qtyMap.get("HP I3")+qty);
					}else {
						qtyMap.put("HP I3", qty);
					}
					generateBill(qtyMap,map,user);
					break;
				}
				System.out.println("Do you want to continue");
				ans=sc.next();
				}while(ans.equals("Y")|| ans.equals("y"));
				break;
			}
		case 2:
			do {
			System.out.println("1. Wireless\t"+"200\n"+"2. With wire\t"+"100\n"+"Enter selection");
			choice =sc.nextInt();
			switch(choice) {
			case 1: 
				WirelessMouse wirelessMouse=new WirelessMouse(200, "WireLess Mouse");
				map.put("WireLess Mouse",wirelessMouse);
				System.out.println("Enter quantity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("WireLess Mouse")) {
					qtyMap.put("WireLess Mouse", qtyMap.get("WireLess Mouse")+qty);
				}else {
					qtyMap.put("WireLess Mouse", qty);
				}
				generateBill(qtyMap,map,user);
			break;
			case 2: 
				WiredMouse wiredMouse=new WiredMouse(100, "With wire Mouse");
				map.put("With wire Mouse",wiredMouse);
				System.out.println("Enter quantity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("With wire Mouse")) {
					qtyMap.put("With wire Mouse", qtyMap.get("With wire Mouse")+qty);
				}else {
					qtyMap.put("With wire Mouse", qty);
				}
				generateBill(qtyMap,map,user);
			break;
			}
			System.out.println("Do you want to continue");
			ans=sc.next();
			}while(ans.equals("y")|| ans.equals("Y"));
			break;
		case 3:
			do {
			System.out.println("1. Wireless Keyboard\t"+"200\n"+"2. With wire Keyboard\t"+"100\n"+"Enter selection");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				WireLessKeyBoard wirelessKeyBoard=new WireLessKeyBoard(200,"Wireless Keyboard");
				map.put("Wireless Keyboard", wirelessKeyBoard);
				System.out.println("Enter quantity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("Wireless Keyboard")) {
					qtyMap.put("Wireless Keyboard", qtyMap.get("Wireless Keyboard")+qty);
				}else {
					qtyMap.put("Wireless Keyboard", qty);
				}
				generateBill(qtyMap,map,user);
			break;
			case 2: 
				WiredKeyBoard wiredKeyBoard=new WiredKeyBoard(100,"Wired Keyboard");
				map.put("Wired Keyboard", wiredKeyBoard);
				System.out.println("Enter quantity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("Wired Keyboard")) {
					qtyMap.put("Wired Keyboard", qtyMap.get("Wired Keyboard")+qty);
				}else {
					qtyMap.put("Wired Keyboard", qty);
				}
				generateBill(qtyMap,map,user);
			break; 
			}
			System.out.println("Do you want to continue");
			ans=sc.next();
			}
			while(ans.equals("Y")||ans.equals("y"));
			break;
		case 4:
			do {
			System.out.println("1. Wireless WebCam\t"+"200\n"+"2. With wire WebCam\t"+"100\n"+"Enter selection");
			choice =sc.nextInt();
			switch(choice) {
			case 1:
				WirlessWebCam wirelessCam=new WirlessWebCam(100, "Wireless WebCam");
				map.put("Wireless WebCam", wirelessCam);
				System.out.println("Enter quantity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("Wireless WebCam")) {
					qtyMap.put("Wireless WebCam", qtyMap.get("Wireless WebCam")+qty);
				}else {
					qtyMap.put("Wireless WebCam", qty);
				}
				generateBill(qtyMap,map,user);
			break;
			case 2:
				WiredWebCam wiredWebCam=new WiredWebCam(100,"Wired WebCam");
				map.put("Wired WebCam", wiredWebCam);
				System.out.println("Enter quantity");
				qty=sc.nextInt();
				if(qtyMap.containsKey("Wired WebCam")) {
					qtyMap.put("Wired WebCam", qtyMap.get("Wired WebCam")+qty);
				}else {
					qtyMap.put("Wired WebCam", qty);
				}
				generateBill(qtyMap,map,user);
			break;
			}
			System.out.println("Do you want to continue");
			ans=sc.next();
			}while(ans.equals("Y")||ans.equals("y"));
			
			case 5:
				do {
				System.out.println("1. Wireless HeadSet\t"+"200\n"+"2. With wire HeadSet\t"+"100\n"+"Enter selection");
				choice =sc.nextInt();
				switch(choice) {
				case 1:
					WireLessHeadSet wireLessHeadSet=new WireLessHeadSet(200, "Wireless HeadSet");
					map.put("Wireless HeadSet", wireLessHeadSet);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Wireless HeadSet")) {
						qtyMap.put("Wireless HeadSet", qtyMap.get("Wireless HeadSet")+qty);
					}else {
						qtyMap.put("Wireless HeadSet", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				case 2:
					WiredHeadSet wiredHeadset=new WiredHeadSet(100, "Wired HeadSet");
					map.put("Wired HeadSet", wiredHeadset);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Wired HeadSet")) {
						qtyMap.put("Wired HeadSet", qtyMap.get("Wired HeadSet")+qty);
					}else {
						qtyMap.put("Wired HeadSet", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				
				}
				System.out.println("Do you want to continue");
				ans=sc.next();
				}while(ans.equals("Y")||ans.equals("y"));
			case 6:
				do {
				System.out.println("1. Aspen wood\t"+"100\n"+"2. Honeycomb\t"+"200\n"+"Enter selection");
				choice =sc.nextInt();
				switch(choice) {
				case 1: 
					Aspen aspen=new Aspen(100, "Aspen wood");
					map.put("Aspen wood",aspen);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Aspen wood")) {
						qtyMap.put("Aspen wood", qtyMap.get("Aspen wood")+qty);
					}else {
						qtyMap.put("Aspen wood", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				case 2: 
					HoneyComb comb=new HoneyComb(200, "Honeycomb");
					map.put("Honeycomb", comb);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Honeycomb")) {
						qtyMap.put("Honeycomb", qtyMap.get("Honeycomb")+qty);
					}else {
						qtyMap.put("Honeycomb", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				}
				
				}while(ans.equals("Y")||ans.equals("y"));
			case 7:
				do {
				System.out.println("1. Tripp Lite\t"+"200\n"+"2. Surface Mini\t"+"200\n"+"Enter selection");
				choice =sc.nextInt();
				switch(choice) {
				case 1: 
					TrippLite triplite=new TrippLite(200, "Tripp Lite");
					map.put("Tripp Lite",triplite );
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Tripp Lite")) {
						qtyMap.put("Tripp Lite", qtyMap.get("Tripp Lite")+qty);
					}else {
						qtyMap.put("Tripp Lite", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				case 2:
					SurfaceMini surfaceMini=new SurfaceMini(200,"Surface Mini");
					map.put("Surface Mini",surfaceMini);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Surface Mini")) {
						qtyMap.put("Surface Mini", qtyMap.get("Surface Mini")+qty);
					}else {
						qtyMap.put("Surface Mini", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				}
				System.out.println("Do you want to continue");
				ans=sc.next();
				}while(ans.equals("Y")||ans.equals("y"));
			break;
			case 8:
				do {
				System.out.println("1. Type A \t"+"200\n"+"2.Type B\t"+"200\n"+"Enter selection");
				choice =sc.nextInt();
				switch(choice) {
				case 1:
					
					map.put("Type A", (double) 200);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Type A")) {
						qtyMap.put("Type A", qtyMap.get("Type A")+qty);
					}else {
						qtyMap.put("Type A", qty);
					}
					generateBill(qtyMap,map,user);
				break;
				case 2: 
					map.put("Type B", (double) 200);
					System.out.println("Enter quantity");
					qty=sc.nextInt();
					if(qtyMap.containsKey("Type B")) {
						qtyMap.put("Type B", qtyMap.get("Type B")+qty);
					}else {
						qtyMap.put("Type B", qty);
					}
					generateBill(qtyMap,map,user);
				break;
					
				}
				}while(ans.equals("Y")||ans.equals("y"));
			break;
			}
		
		System.out.println("Do you want to continue");
		ans=sc.next();
		}while(ans.equals("Y")|| ans.equals("y"));
	}
	public static void generateBill(Map<String, Integer> qtyMap, Map<String, Object> map,User user) {
		int qty=0;
		int srNo=1;
		double total=0;
		System.out.println("------------Your Bill-------------------------------------------");
		System.out.println("Sl No."+"\t"+" "+ "Flavour" +"\t"+" "+"\t"+"Price"+"\t"+" "+"Quantity"+"\t"+" "+"Amount");
		System.out.println("------------------------------------------------------------------");
		
		for(Map.Entry<String, Integer> entry:qtyMap.entrySet()) {
			Accessary o1=(Accessary) map.get(entry.getKey());
			System.out.println(srNo+"\t "+entry.getKey() +"\t"+" "+"\t"+o1.price+"\t"+" "+qtyMap.get(entry.getKey())+"\t"+" "+qtyMap.get(entry.getKey())*o1.price);
			total=total+entry.getValue()* o1.price;
			srNo=srNo+1;
		}
		System.out.println("--------------------------------------------------------------------");
		System.out.println("Total"+" "+total);
		double price;
		if(total<user.getGiftPrice()) {
			price=total-user.getGiftPrice();
			user.SetGiftPrice(price);
			System.out.println(user.getName()+" "+"Remaining gift price: "+ Math.abs(user.getGiftPrice()));
		}
		else {
			System.out.println(user.getName()+" "+"You don't have gift price remain now");
			System.out.println("-------------------------------------------------");
			System.out.println("Price you have to pay is "+" "+ (total-user.giftPrice));
		}
	}
}
	

	


