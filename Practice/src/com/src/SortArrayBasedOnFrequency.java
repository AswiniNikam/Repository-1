package com.src;
import java.util.*;

public class SortArrayBasedOnFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr= {10,7,10,11,10,7,5,6};
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		List<Integer> list=Arrays.asList(arr);
		Collections.sort(list,(n1,n2)->{
			return map.get(n2)-map.get(n1);
		});
		System.out.println(list);
		
	}

}
