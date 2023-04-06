package com.sample;
import java.util.*;

public class GetIndexOfPermutations {
	public List<Integer> getPermutations(String s, String pattern) {
		int end=0, start=0, match=0, winSize=Integer.MAX_VALUE;
		String ans="";
		List<Integer> list=new ArrayList<>();
		Map<Character,Integer> map=new HashMap<>();
		for(end=0;end<pattern.length();end++) {
			char ch=pattern.charAt(end);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		for(end=0;end<s.length();end++) {
			char ch=s.charAt(end);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==0) {
					match=match+1;
				}
			}
			if(map.size()==match && (end-start+1)<winSize) {
				list.add(start);
				winSize=end-start+1;
				ans=s.substring(start, end+1);
			}
			if(end>=pattern.length()-1) {
				char charAtStart=s.charAt(start++);
				if(map.containsKey(charAtStart)) {
					if(map.get(charAtStart)==0) {
						match=match-1;
					}
					map.put(charAtStart, map.get(charAtStart)+1);
				}
			}
			
		}
		System.out.println(ans);
		System.out.println(winSize);
		
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetIndexOfPermutations a=new GetIndexOfPermutations();
		String str="badeaebcaae";
		String pattern="aabc";
		
		List<Integer> list= a.getPermutations(str,pattern );
		System.out.println(list);
		

	}

}
