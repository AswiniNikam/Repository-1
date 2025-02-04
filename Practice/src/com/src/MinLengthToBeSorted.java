package com.src;

public class MinLengthToBeSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 2, 5, 3, 0, 22, 13, 8, 15, 18 };
		 int i=0, j=arr.length-1;
		 while(i<arr.length-1 && arr[i]<arr[i+1]) {
			 i++;
		 }
		 while(j>=0 && arr[j]>arr[j-1]) {
			 j--;
		 }
		 int min=Integer.MAX_VALUE;
		 int max=Integer.MIN_VALUE;
		 
		for(int k=i+1;k<j;k++) {
			min=Math.min(arr[k], min);
			max=Math.max(max, arr[k]);
		}
		while(i>=0 && arr[i]>min) {
			i--;
		}
		while(j<arr.length && arr[j]<max) {
			j++;
		}
		System.out.println(j-i-1);
	}

}
