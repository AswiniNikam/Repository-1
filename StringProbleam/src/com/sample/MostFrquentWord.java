package com.sample;
import java.util.*;

public class MostFrquentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Best item in Category. Lenovo Samsung Lenovo? item";
		str=str.replaceAll("[^a-zA-Z]", " ").toLowerCase();
		String[] sArr=str.split(" +");
		Map<String, Integer> map=new HashMap<>();
		for(int i=0;i<sArr.length;i++) {
			String s=sArr[i];
			map.put(s, map.getOrDefault(s, 0)+1);
		}
		System.out.println(map);
		List<Map.Entry<String, Integer>>list=new ArrayList<>(map.entrySet());
		Collections.sort(list,(n1,n2)->{
			int val1=n1.getValue();
			int val2=n2.getValue();
			if(val1!=val2) {
				return val2-val1;
			}
			return n1.getKey().compareTo(n2.getKey());
		});
		System.out.println(list.get(0).getKey());
		
		

	}

}
