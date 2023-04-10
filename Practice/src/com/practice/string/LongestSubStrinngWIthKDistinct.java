package com.practice.string;
import java.util.*;
public class LongestSubStrinngWIthKDistinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="bccbcbccd";
		int k=2, maxl=Integer.MIN_VALUE;
		Map<Character, Integer> map=new HashMap<>();
		int end=0, start=0;
		while(end<a.length()) {
			map.put(a.charAt(end), map.getOrDefault(a.charAt(end), 0)+1);
			while(map.size()>k && start<end) {
				map.put(a.charAt(start), map.get(a.charAt(start))-1);
				start++;
				if(map.get(a.charAt(start))==0) {
					map.remove(a.charAt(start));
				}
			}
			maxl=Math.max(maxl,end-start+1);
			end++;
		}
		System.out.println(maxl);

	}

}
