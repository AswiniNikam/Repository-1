package com.src;

public class FindTripletsLessThan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = { 1, 2, -3, 4, -2};
		 int sum=1;
		 for(int i=0;i<arr.length;i++) {
			 int rSum=sum-arr[i];
			 int start=i+1;
			 int end=arr.length-1;
			 while(start<end) {
				 int total=arr[start]+arr[end]+arr[i];
				 if(total<sum) {
					 System.out.println(arr[start]+" "+arr[i]+" "+arr[end]);
					 start++;
				 }
				 else {
					 end--;
				 }
			 }
		 }
	}

}
