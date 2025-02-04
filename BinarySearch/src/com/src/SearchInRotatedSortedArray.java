package com.src;

public class SearchInRotatedSortedArray {
	public static int findPivot(int[] nums, int target) {
		int  start=0, end=nums.length-1;
		while(start<=end) {
			int mid=(end+start)/2;
			if(nums[mid]>nums[mid+1]) {
				return mid;
			}
			if(nums[mid-1]>nums[mid]) {
				return mid-1;
			}
			if(nums[start]>nums[mid]) {
				end=mid-1;
			}
			else {
				start=mid+1;
			}
		}
		return -1;
	}
	public static int binarySearch(int[] nums, int start, int end, int target) {
		int mid=0;
		while(start<=end) {
			mid=(end+start)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,1,2};
		int target=0, pivot=-1;;
		pivot= SearchInRotatedSortedArray.findPivot(arr, target);
		System.out.println(pivot);
		if(pivot==-1) {
			int index=SearchInRotatedSortedArray.binarySearch(arr, 0, arr.length-1, target);
			System.out.println(index);
			return;
		}
		if(arr[pivot]==target) {
			System.out.println(pivot);
			return;
		}
		if(target>arr[0]) {
			int index=SearchInRotatedSortedArray.binarySearch(arr,0, pivot-1, target);
			System.out.println(index);
			return;
		}
		int index=SearchInRotatedSortedArray.binarySearch(arr,pivot+1, arr.length-1, target);
		System.out.println(index);
		return;
	}

}
