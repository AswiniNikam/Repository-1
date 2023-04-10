package com.src;

public class FndQuadruple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,-3,4,-2,-1,3};
		int sum=3;
		for(int i=0;i<arr.length;i++) {
			for(int  j=i+1;j<arr.length;j++) {
				int rSum=sum-(arr[i]+arr[j]);
				int start=j+1;
				int end=arr.length-1;
				while(start<end) {
					int total=arr[start]+arr[end];
					if(total<rSum) {
						start++;
					}
					else if(total>rSum) {
						end--;
					}
					else {
						System.out.println(arr[start]+" "+arr[end]+" "+arr[i]+" "+arr[j]);
						start++;
						end--;
					}
				}
			}
		}

	}

}
