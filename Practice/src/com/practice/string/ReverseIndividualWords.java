package com.practice.string;

public class ReverseIndividualWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="coding simplifed nice";
		String temp="", finalstring="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch!=' ') {
				temp=ch+temp;
			}else{
				finalstring=finalstring+temp+" ";
				temp="";
			}
		}
		finalstring=finalstring+temp;
		System.out.println(finalstring);
	}

}
