package com.src;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,4,1,3,6,7,8};
		int i=0;
		while(i<arr.length) {
			if(arr[i]<=arr.length && arr[i]!=i+1) {
				int other=arr[i]-1;
				int temp=arr[i];
				arr[i]=arr[other];
				arr[other]=temp;
			}else {
				i++;
			}
		}
		for(i=0;i<arr.length;i++) {
			if(arr[i]!=i+1) {
				System.out.println(i+1);
			}
		}
	}

}
