package com.src;

public class MaxSumOfSizeK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,5,4,1};
		int k=3, sum=0;
		for(int i=0;i<k;i++) {
			sum=sum+arr[i];
		}
		int start=0;
		int maxsum=sum;
		for(int i=k;i<arr.length;i++) {
			sum=sum+arr[i]-arr[start++];
			maxsum=Math.max(maxsum, sum);
		}
		System.out.println(maxsum);
	}

}
