package com.sample;
import java.util.*;

public class LongestSubStringWithKCharactersReplaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bccbababd";
		int k=2;
		int end=0, start=0, winSize=Integer.MIN_VALUE, maxF=Integer.MIN_VALUE;
		Map<Character,Integer> map=new HashMap<>();
		while(end<s.length()) {
			char ch=s.charAt(end);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			maxF=Math.max(maxF, map.get(ch));
			while(end-start+1-maxF>k && start<end) {
				ch=s.charAt(start++);
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==0) {
					map.remove(ch);
				}
			}
			winSize=Math.max(winSize, end-start+1);
			end++;
		}
		System.out.println(winSize);

	}

}
