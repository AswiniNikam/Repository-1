package com.sample;

import java.util.HashMap;
import java.util.*;

public class MostFrequentWordUsingTreeMap {

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
		map.remove("in");
		map.remove("are");
		TreeMap<String,Integer> tmap=new TreeMap<>((e1,e2)->{
			int val1=map.get(e1);
			int val2=map.get(e2);
			if(val1!=val2) {
				return val2-val1;
			}
			return e1.compareTo(e2);
		});
		tmap.putAll(map);
		Map.Entry<String, Integer> entry=tmap.firstEntry();
		int f=entry.getValue();
		
		while(!tmap.isEmpty()) {
			Map.Entry<String, Integer> word= tmap.pollFirstEntry();
			if(word.getValue()==f) {
				System.out.println(word.getKey());
				break;
			}
		}
		
		
	}

}
