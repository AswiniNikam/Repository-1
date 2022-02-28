package String;

import java.util.HashSet;
import java.util.Set;

public class IsPalindrome {
	public static void main(String[] arr) {
		String s=".";
		String str = "";
        StringBuffer s1=new StringBuffer(s);
        for(int i=0;i<s1.length();i++) {
        	if(!(Character.isLetter(s1.charAt(i)))) {
        		s1.deleteCharAt(i);
        	}else {
        		str=str+s1.charAt(i);
        	}
        }
        System.out.println("String is"+ str);
	}
}
