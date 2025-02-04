package com.src;
import java.util.*;

public class LongestArrayIfZeroReplaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,0,1,0,1,1,1,0};
		int end=0, start=0, maxF=Integer.MIN_VALUE, k=2,len=Integer.MIN_VALUE;
		Map<Integer, Integer> map=new HashMap<>();
		while(end<arr.length) {
			map.put(arr[end], map.getOrDefault(arr[end],0)+1);
			maxF=Math.max(maxF, map.get(arr[end]));
			while(end-start+1-maxF>k && start<end) {
				map.put(arr[start], map.get(arr[start])-1);
				start++;
				if(map.get(arr[start])==0) {
					map.remove(arr[start]);
				}
			}
			len=Math.max(end-start+1, len);
			end++;
		}
		System.out.println(len);
	}

}
