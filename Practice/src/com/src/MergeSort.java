package com.src;

public class MergeSort {
	public static void merge(int[] arr, int start, int end) {
		int mid=0;
		if(start!=end) {
			mid=(end+start)/2;
			merge(arr, start, mid);
			merge(arr, mid+1, end);
			mergeSort(arr, start, mid, end);
		}
	}
	public static void mergeSort(int[] arr, int start, int mid, int end) {
		int[] temp=new int[end-start+1];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) {
				temp[k++]=arr[i++];
			}
			else if(arr[j]<arr[i]) {
				temp[k++]=arr[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=arr[i++];
		}
		while(j<=end) {
			temp[k++]=arr[j++];
		}
		for(i=start;i<=end;i++) {
			arr[i]=temp[i-start];
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,14,2,3,1};
		System.out.println("Before");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		MergeSort.merge(arr, 0, arr.length-1);
		System.out.println("After");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
