package com.src;

public class CeilingOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,9,14,16,18};
		int target=15, mid=0;
		int start=0, end=arr.length-1;
		while(start<=end) {
			mid=(end+start)/2;
			if(arr[mid]==target) {
				System.out.println("Ceiling of number is" + arr[mid]);
				return;
			}else if(target>arr[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		System.out.println("Ceiling of number is"+ arr[start]);

	}

}
