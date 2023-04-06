package com.src;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;



class CacheEntry{
	int key;
	String value;
	public  CacheEntry(int key, String val) {
		this.key=key;
		this.value=val;
	}
}
class LRUImplementation{
	Deque<CacheEntry> q1=new LinkedList<>();
	Map<Integer, CacheEntry> map=new HashMap<>();
	int size=3;
	public String getFromCache(int key) {
		if(map.containsKey(key)) {
			CacheEntry entry=map.get(key);
			q1.remove(entry);
			q1.addFirst(entry);
			return entry.value;
		}
		return null;
	}
	public void putEntryIntoCache(int key, String value) {
		if(map.containsKey(key)) {
			CacheEntry entry=map.get(key);
			q1.remove(entry);
		}
		else {
			if(q1.size()==size) {
				CacheEntry entry=q1.removeLast();
				map.remove(entry);
			}
		}
		CacheEntry entry=new CacheEntry(key, value);
		q1.addFirst(entry);
		map.put(key, entry);
	}
	public static void main(String[] args) {
	    
		LRUImplementation cache = new LRUImplementation();
	    cache.putEntryIntoCache(1, "Product-1-Info");
	    cache.putEntryIntoCache(2, "Product-2-Info");
	    cache.putEntryIntoCache(3, "Product-3-Info");
	    cache.putEntryIntoCache(4, "Product-4-Info");
	    
	    System.out.println(cache.getFromCache(2));
	    System.out.println(cache.getFromCache(6));
	    
	  }

}
