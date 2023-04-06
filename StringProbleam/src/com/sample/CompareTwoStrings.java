package com.sample;

public class CompareTwoStrings {
	public static boolean checkIfEqual(String s1, String s2) {
		int end1=s1.length()-1;
		int end2=s2.length()-1;
		while(end1>=0 && end2>=0) {
			int s1Index=getIndex(s1, end1);
			int s2Index=getIndex(s2, end2);
			if(s1Index<=0 && s2Index<=0) {
				return true;
			}
			if(s1Index<=0 || s2Index<=0) {
				return false;
			}
			if(s1.charAt(s1Index)!=s2.charAt(s2Index)) {
				return false;
			}
			end1=s1Index-1;
			end2=s2Index-1;
			
		}
		if(end1==-1 && end2==-1) {
			return true;
		}
		return false;
	}
	public static int getIndex(String s,  int end) {
		int specialChar=0;
		while(end>=0) {
			if(s.charAt(end)=='#') {
				specialChar=specialChar+1;
			}
			else {
				if(specialChar==0) {
					return end;
				}
				specialChar=specialChar-1;
			}
			end--;
		}
		return end;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="bcd##e";
		String s2="bad#e";
		boolean ans=CompareTwoStrings.checkIfEqual(s1,s2);
		System.out.println(ans);
		

	}

}
