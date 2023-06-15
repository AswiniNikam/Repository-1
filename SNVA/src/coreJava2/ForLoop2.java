package coreJava2;
import java.util.*;

public class ForLoop2 {
	public static void main(String[] args) {
		String ans="";
		Scanner sc=new Scanner(System.in);
		for(;;) {
			System.out.println("Want to continue?");
			ans=sc.next();
			if(ans.equals("yes")) {
			System.out.println("Java is esy to learn");
			}else {
			break;
			}
		}
		
	}

}
