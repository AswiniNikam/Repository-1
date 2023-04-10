package com.practice.string;
import java.util.*;

public class LongestSubStringWithKDistinctWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bccbabacd";
		int k=2, len=Integer.MIN_VALUE;
		Map<Character,Integer> map=new HashMap<>();
		int start=0, end=0;
		while(end<s.length()) {
			if(map.containsKey(s.charAt(end))){
				start=Math.max(start, map.get(s.charAt(end))+1);
			}
			map.put(s.charAt(end), end);
			len=Math.max(end-start+1, len);
			end++;
		}
		System.out.println(len);
	}

}
