package com.src;

public class firstOccurrence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {7, 6, 7, 6, 7, 6, 5, 4, 5, 4, 3, 2, 1, 2, 3};
		int num=2;
		int start=0;
		while(start<arr.length) {
			if(arr[start]==num) {
				System.out.println(start);
				return;
			}
			int diff=Math.abs(arr[start]-num);
			start=start+diff;
		}
		System.out.println("Number not found");
	}

}
