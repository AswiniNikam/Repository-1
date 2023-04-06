package com.sample;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="coding";
		String s="";
		for(int i=0;i<str.length();i++) {
			s=str.charAt(i)+s;
		}
		System.out.println(s);

	}

}
