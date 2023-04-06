package com.sample;

public class ReverseIndividualWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Coding Simplified Nice";
		String tempStr="";
		String finalStr="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)!=' ') {
				tempStr=str.charAt(i)+tempStr;
			}
			else {
				finalStr=finalStr+tempStr+" ";
				tempStr="";
			}
		}
		finalStr=finalStr+tempStr;
		System.out.println(finalStr);
	}

}
