package com.src;

public class SubArrayWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,2,5,3,1,8};
		int sum=9;
		int start=0, end=0,total=0;
		while(end<arr.length) {
			total=total+arr[end];
			if(total==sum) {
				System.out.println("start Index"+" "+start+" "+"End Index"+end);
			}
			while(total>sum && start<end) {
				total=total-arr[start++];
				if(total==sum) {
					System.out.println("start Index"+" "+start+" "+"End Index"+end);
				}
			}
			end++;
		}

	}

}
