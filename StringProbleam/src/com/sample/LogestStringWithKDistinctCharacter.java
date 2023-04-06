package com.sample;
import java.util.*;
public class LogestStringWithKDistinctCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="bccbababd";
		int end=0, start=0, winsize=Integer.MIN_VALUE, k=2;
		Map<Character,Integer> map=new HashMap<>();
		while(end<str.length()) {
			char ch=str.charAt(end);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			while(map.size()>k) {
				ch=str.charAt(start++);
				map.put(ch, map.get(ch)-1);
				if(map.get(ch)==0) {
					map.remove(ch);
				}
			}
			winsize=Math.max(winsize, end-start+1);
			end++;
		}
		System.out.println(winsize);

	}

}
