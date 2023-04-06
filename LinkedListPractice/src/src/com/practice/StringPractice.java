package src.com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class StringPractice {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Best item in category. Lenove Samsung Lenovo? item";
		str=str.replaceAll("[^a-zA-Z]", " ").toLowerCase();
		System.out.println(str);
		String[] strArr=str.split(" +");
		Map<String,Integer> map=new HashMap<>();
		for(int i=0;i<strArr.length;i++) {
			map.put(strArr[i], map.getOrDefault(strArr[i],0)+1);
		}
		map.remove("in");
		map.remove("are");
		TreeMap<String,Integer> m1=new TreeMap<>((n1,n2)->{
			int val1=map.get(n1);
			int val2=map.get(n2);
			if(val1!=val2) {
				return val2-val1;
			}
			return n1.compareTo(n2);
		});
		m1.putAll(map);
		
		Map.Entry<String, Integer> entry= m1.firstEntry();
		System.out.println(entry.getKey());
		
		

}
}
