package sample;

import java.util.Stack;

public class StringPractice {
	static Stack<Character> s1=new Stack<Character>();
	static int res=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="2+3+1";
		int num1=0;
		String st="";
		int num2=0;
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='*') {
				int firstOp=i-1;
				int secondOP=i+1;
				while(firstOp>=0) {
					 st=StringPractice.getFirstOperand(str.charAt(firstOp),st);
					firstOp--;
				}
				num1=StringPractice.convertInt(st);
				System.out.println(num1);
				st="";
				while(str.charAt(secondOP)!='+'&&str.charAt(secondOP)!='*') {
					st=StringPractice.getSecondOperand(str.charAt(secondOP),st);
					 secondOP++;
				}
				num2=StringPractice.convertInt(st);
				System.out.println(num2);
				StringPractice.operation(num1, str.charAt(i), num2);
			}
			
			else if(str.charAt(i)=='+') {
				st="";
				int firstOp=i-1;
				int secondOP=i+1;
				while(firstOp>=0&& str.charAt(firstOp)!='*') {
					 st=StringPractice.getFirstOperand(str.charAt(firstOp),st);
					firstOp--;
				}
				num1=StringPractice.convertInt(st);
				System.out.println(num1);
				st="";
				while(secondOP<=str.length()-1&&str.charAt(secondOP)!='+'&&str.charAt(secondOP)!='*') {
					st=StringPractice.getSecondOperand(str.charAt(secondOP),st);
					 secondOP++;
				}
				num2=StringPractice.convertInt(st);
				System.out.println(num2);
				StringPractice.operation(num1, str.charAt(i), num2);
			}
			
		}
		
		
	}
	public static int convertInt(String st) {
		int num=Integer.parseInt(st);
		return num;
	}
	public static String getFirstOperand(char ch,String st) {
		st=ch+st;
		return st;
	}
	public static String getSecondOperand(char ch,String st) {
		st=st+ch;
		return st;
	}
	public static void operation(int num1,char c,int num2) {
		
		if(c=='*') {
			 res=num1*num2;
			System.out.println("Multiplication"+res);
		}else {
			 res=res+num2;
			System.out.println("Addition"+res);
		}
	}
	

}
