package com.src;

import java.util.List;
import java.util.*;

public class FirstAndLastPositionOfNumber {
	public static int[] getIndex(int[] arr, int target){
		int[] ans=new int[2];
		ans[0]=search(arr, 0, arr.length-1, target, true);
		ans[1]=search(arr, 0, arr.length-1, target, false);
		return ans;
		
	}
	public static int search(int[] nums, int start, int end,int target, boolean isFrist) {
		int mid=0, ans=-1;
		while(start<=end) {
			mid=(end+start)/2;
			if(nums[mid]==target) {
				ans=mid;
				if(isFrist) {
					end=mid-1;
				}else {
					start=mid+1;
				}
			}
			else if(target>nums[mid]) {
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] arr= {5,7,7,8,8,10};
		int target=8;
		int[] ans=FirstAndLastPositionOfNumber.getIndex(arr, target);
		for(int i=0;i<ans.length;i++) {
			System.out.println(ans[i]);
		}
	}

}
