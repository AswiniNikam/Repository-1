package com.src;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {0,1,1,0,2,2,1,0,2};
		int l=0, m=0, h=arr.length-1;
		while(m<h) {
			if(arr[m]==0) {
				int temp=arr[l];
				arr[l]=arr[m];
				arr[m]=temp;
				l++;
				m++;
			}
			if(arr[m]==1) {
				m++;
			}
			if(arr[m]==2) {
				int temp=arr[m];
				
				arr[m]=arr[h];
				arr[h]=temp;
				h--;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}
