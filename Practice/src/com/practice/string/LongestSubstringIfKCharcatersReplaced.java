package com.practice.string;
import java.util.*;

public class LongestSubstringIfKCharcatersReplaced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bccbababd";
			int k=2, maxF=Integer.MIN_VALUE;
			Map<Character,Integer> map=new HashMap<>();
			int end=0, start=0,maxL=Integer.MIN_VALUE;
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
				maxL=Math.max(maxL,end-start+1);
				end++;
			}
			System.out.println(maxL);
	}

}
