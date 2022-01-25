package sample;

public class Calc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="1+1+2";
		int addCount=0;
		int mulCount=0;
		int ans=0;
		String[] strArr=s1.split("[^(0-9]");
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='*') {
				mulCount++;
			}else if(s1.charAt(i)=='+') {
				addCount++;
			}
		}
		if(mulCount!=0&& addCount!=0 && s1.indexOf("*")<s1.indexOf("+")) {
			 ans=Integer.parseInt(strArr[0])*Integer.parseInt(strArr[1]);
			 ans=ans+Integer.parseInt(strArr[2]);
		}else if(mulCount!=0&& addCount!=0 && s1.indexOf("*")>s1.indexOf("+")) {
			ans=Integer.parseInt(strArr[1])*Integer.parseInt(strArr[2]);
			ans=ans+Integer.parseInt(strArr[0]);
		}else {
			ans=Integer.parseInt(strArr[1])+Integer.parseInt(strArr[2]);
			ans=ans+Integer.parseInt(strArr[0]);
		}
		
		System.out.println("Answer is"+ans);

	}

}
