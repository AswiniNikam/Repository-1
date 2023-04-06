package com.sample;

public class PrintFirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello User!! Welcome";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				if(i==0) {
					System.out.println(str.charAt(i));
				}else if(str.charAt(i-1)==' ') {
					System.out.println(str.charAt(i));
				}
			}
		}

	}

}
