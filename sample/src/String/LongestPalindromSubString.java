package String;

public class LongestPalindromSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="babad";
		int j=0;
		String s="";
		String maxString="";
		String srev="";
		while(j<str.length()) {
			srev="";
			s=s+str.charAt(j);
			for(int i=s.length()-1;i>=0;i--) {
				 
				srev=srev+s.charAt(i);
			}
			if(s.equals(srev)) {
				System.out.println(s+" "+srev+" "+"Palindrom");
				if(s.length()>maxString.length()) {
					maxString=s;
					
				}
				
			}
			j++;
		}
		
	}

}
