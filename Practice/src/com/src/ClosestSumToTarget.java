package com.src;

public class ClosestSumToTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,-3,4,-2};
		int sum=1,total=0, closeSum=0, diff=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			int start=i+1;
			int end=arr.length-1;
			while(start<end) {
				total=arr[i]+arr[start]+arr[end];
				if(Math.abs(total-sum)< diff) {
					diff= Math.abs(total-sum);
					closeSum=total;
				}
				if(total==sum){
					System.out.println(total);
					return;
				}
				else if(total<sum) {
					start++;
				}
				else {
					end--;
				}
				
			}
		}
		System.out.println(closeSum);
	}

}
