package com.sample;
import java.util.*;

public class LongestSubStringWithNoRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bcdaecbfbacd";
		int end=0, start=0, winSize=Integer.MIN_VALUE;
		Map<Character,Integer> map=new HashMap<>();
		while(end<str.length()) {
			char ch=str.charAt(end);
			while(map.containsKey(ch)) {
				ch=str.charAt(start++);
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==0) {
					map.remove(ch);
				}
			}
			map.put(ch, map.getOrDefault(ch, 0)+1);
			winSize=Math.max(winSize, end-start+1);
			end++;
		}
		System.out.println(winSize);

	}

}
