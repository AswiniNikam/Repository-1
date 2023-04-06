package com.practice;
import java.util.*;

public class TopKFrequent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {8,10,7,8,11,30,11,8,38,11,2,45,2,8};
		int k=3;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
		}
		PriorityQueue<Map.Entry<Integer, Integer>> q1=new PriorityQueue<>((e1,e2)->{
			int val1=e1.getValue();
			int val2=e2.getValue();
			if(val1!=val2) {
				return val1-val2;
			}
			return e1.getKey()-e2.getKey();
		});
		
		q1.addAll(map.entrySet());
		int i=0;
		while((!q1.isEmpty()) && i<k) {
			System.out.println(q1.peek().getKey());
			i++;
			q1.poll();
		}
		

	}

}
