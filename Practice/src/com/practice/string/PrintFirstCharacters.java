package com.practice.string;

public class PrintFirstCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Coding Simplified Nice";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				System.out.println(s.charAt(i));
			}
			else {
				if(s.charAt(i)== ' ') {
					System.out.println(s.charAt(i+1));
				}
			}
		}

	}

}
