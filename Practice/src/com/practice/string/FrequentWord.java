package com.practice.string;
import java.util.*;

public class FrequentWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Best item in category. Lenovo Samsing Lenovo? item";
		s=s.replaceAll("[^a-z A-Z]", "").toLowerCase();
		System.out.println(s);
		Map<String, Integer> map=new HashMap<>();
		String[] sArr=s.split(" ");
		for(int i=0;i<sArr.length;i++) {
			map.put(sArr[i], map.getOrDefault(sArr[i],0)+1);
		}
		List<Map.Entry<String, Integer>> list=new ArrayList<>(map.entrySet());
		Collections.sort(list,(n1,n2)->{
			int val1=n1.getValue();
			int val2=n2.getValue();
			if(val1!=val2) {
				return val2-val1;
			}
			return val1-val2;
		});
		System.out.println(list);
		
		
	}

}
