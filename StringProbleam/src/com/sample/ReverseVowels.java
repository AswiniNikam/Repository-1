package com.sample;

public class ReverseVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="equation";
		char[] sArr=str.toCharArray();
		int start=0, end=sArr.length-1;
		while(start<end) {
			while(start<sArr.length && (!isVowel(sArr[start]))) {
				start++;
			}
			while(end>=0 && (!isVowel(sArr[end]))){
				end--;
			}
			if(start<end) {
				char temp=sArr[start];
				sArr[start]=sArr[end];
				sArr[end]=temp;
				start++;
				end--;
			}
		}
		for(int i=0;i<sArr.length;i++) {
			System.out.println(sArr[i]);
		}

	}
	public static boolean isVowel(char ch) {
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			return true;
		}
		return false;
	}

}
