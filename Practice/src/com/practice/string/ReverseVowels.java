package com.practice.string;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="equation";
		char[] s=str.toCharArray();
		int i=0, j=s.length-1;
		while(i<j) {
			while(i<s.length && (!isVowel(s[i]))) {
				i++;
			}
			while(j>0 && (!isVowel(s[j]))) {
				j--;
			}
			if(i<j) {
				char temp=s[i];
				s[i]=s[j];
				s[j]=temp;
				i++; j--;
			}
		}
		for(i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

	}	


	public static boolean isVowel(char ch) {
		if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
			return true;
		}
		return false;
	}

}
