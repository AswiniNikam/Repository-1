package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class KthLargest {
	
	public static void frequencySort(int[] arr) {
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		PriorityQueue<Map.Entry<Integer,Integer>> q1=new PriorityQueue<>((n1,n2)->{
			int val1=n1.getValue();
			int val2=n2.getValue();
			if(val1!=val2) {
				return val2-val1;
			}
			return n1.getKey()-n2.getKey();
		});
		q1.addAll(map.entrySet());
		while(!q1.isEmpty()) {
			Map.Entry<Integer,Integer> entry=q1.poll();
			System.out.println(entry.getKey());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,7,10,6,10,7,5,8};
		KthLargest.frequencySort(arr);
		
		
	}

}
