package String;

import java.util.ArrayList;
import java.util.List;


public class GoogleProbleam {
	public static void main(String[] arr) {
		String s="eccbbbbdec";
		String substring="";
		int max=0;
		List l1=new ArrayList<Integer>();
		int i=0,j=0;
		while(j<s.length()) {
			if(s.lastIndexOf(s.charAt(j))>max) {
			max=s.lastIndexOf(s.charAt(j));
			substring=s.substring(i,max+1);
			for(int l=0;l<substring.length();l++) {
				int lastOccur=s.lastIndexOf(substring.charAt(l));
				if(lastOccur>max) {
					max=lastOccur;
					substring=s.substring(i,max+1);
				}
			}
			j=max+1;
			i=j;
			System.out.println(substring);
			l1.add(substring.length());
			}
			
		}
		System.out.println(l1);
	}
}
