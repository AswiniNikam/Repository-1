package com.src;

public class PrintLeadersInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {14,15,8,9,5,2};
		int min=Integer.MIN_VALUE;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]>min) {
				System.out.println(arr[i]);
				min=arr[i];
			}
		}

	}

}
