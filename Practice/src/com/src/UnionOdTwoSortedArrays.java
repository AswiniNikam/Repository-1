package com.src;
import java.util.*;

public class UnionOdTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1= {2,3,4,7,8};
		int[] arr2= {1,2,4,6,7,8,10};
		List<Integer> list=new ArrayList<>();
		int i=0, j=0;
		while(i<arr1.length && j<arr2.length) {
			while(i<arr1.length-1 && arr1[i]==arr1[i+1]) {
				i++;
			}
			while(j<arr2.length-1 && arr2[j]==arr2[j+1]) {
				j++;
			}
			if(arr1[i]<arr2[j]) {
				list.add(arr1[i++]);
			}else if(arr1[i]>arr2[j]) {
				list.add(arr2[j++]);
			}else{
				list.add(arr1[i++]);
				j++;
			}
		}
		while(i<arr1.length) {
			while(i<arr1.length-1 && arr1[i]==arr1[i+1]) {
				i++;
			}
			list.add(arr1[i++]);
		}
		while(j<arr2.length) {
			while(j<arr2.length-1 && arr2[j]==arr2[j+1]) {
				j++;
			}
			list.add(arr2[j++]);
		}
		System.out.println(list);

	}
	

}
