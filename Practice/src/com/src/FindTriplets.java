package com.src;

import java.util.Arrays;

public class FindTriplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,-3,4,-2,-1};
		int sum=1, total=0;
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			int rSum=sum-arr[i];
			int start=i+1;
			int end=arr.length-1;
			while(start<end) {
				total=arr[start]+arr[end];
				if(total<rSum) {
					start++;
				}
				else if(total>rSum) {
					end--;
				}
				else {
					System.out.println(arr[i]+" "+arr[start]+" "+arr[end]);
					start++;end--;
				}

			}
		}
	}

}
