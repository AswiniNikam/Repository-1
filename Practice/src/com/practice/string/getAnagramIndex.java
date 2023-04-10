package com.practice.string;
import java.util.*;

public class getAnagramIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="bcdcbaba";
		String p="abc";
		int match=0, start=0;
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<p.length();i++) {
			char ch=p.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==0) {
					match=match+1;
				}
			}
			if(map.size()==match) {
				System.out.print(start);
			}
			if(i>=p.length()-1) {
				ch=s.charAt(start++);
				if(map.containsKey(ch)) {
					if(map.get(ch)==0) {
						match=match-1;
					}
					map.put(ch, map.get(ch)+1);
				}
			}
		}

	}

}
