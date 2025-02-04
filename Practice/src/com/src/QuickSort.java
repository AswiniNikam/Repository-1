package com.src;

public class QuickSort {
	public static void quickSort(int[] arr, int start, int end) {
		int i=0, pivot=0, j=0, temp=0;
		if(start<end) {
			 pivot=start;
			 i=start;
			 j=end;
			 while(i<j) {
				 while(i<end && arr[i]<arr[pivot]) {
					 i++;
				 }
				 while(j>=0 && arr[j]>arr[pivot]) {
					 j--;
				 }
				 if(i<j) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
				 
			 }
			 temp=arr[j];
			 arr[j]=arr[pivot];
			 arr[pivot]=temp;
			 quickSort(arr, start, j-1);
			 quickSort(arr, j+1, end);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,8,30,6,15,2,1,18};
		System.out.println("Before");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		QuickSort.quickSort(arr, 0, arr.length-1);
		System.out.println("After");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
