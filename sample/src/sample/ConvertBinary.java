package sample;

import java.util.Stack;

public class ConvertBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		String str="";
		int cnt=0;
		Stack s1=new Stack<Integer>();
		while(n!=0) {
			int rem=n%2;
			n=n/2;
			s1.push(rem);
		}
		System.out.println(s1);
		for(int i=s1.size()-1;i>=0;i--) {
		str=str+s1.get(i);
		}
		for(int i=str.indexOf("1");i<=str.indexOf("1", str.indexOf("1"));i++) {
			if(str.charAt(i)!='1') {
				cnt++;
			}
			
		}
		System.out.println(cnt);
		
		
	}

}
