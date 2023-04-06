package src.com.practice;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class CacheEntry{
	int key; String val;
	public CacheEntry(int key, String val) {
		this.key=key;
		this.val=val;
	}
	
}
public class LRUCache{
	Deque<CacheEntry> q1=new LinkedList<>();
	Map<Integer,CacheEntry> m=new HashMap<>();
	int size=3;
	public String getCache(int key) {
		if(m.containsKey(key)) {
			CacheEntry entry=m.get(key);
			q1.remove(entry);
			q1.addFirst(entry);
			return entry.val;
		}
		return null;
	}
	public void putIntoCache(int key, String val) {
		if(m.containsKey(key)) {
			CacheEntry entry=m.get(key);
			q1.remove(entry);
		}else {
			if(q1.size()==size) {
				CacheEntry entry=q1.removeLast();
				m.remove(entry.key);
			}
		}
		CacheEntry entry=new CacheEntry(key, val);
		q1.add(entry);
		m.put(key, entry);
	}
	public static void main(String[] args) {
		LRUCache cache=new LRUCache();
		cache.putIntoCache(1,"Product 1 info");
		cache.putIntoCache(2,"Product 2 info");
		cache.putIntoCache(3,"Product 3 info");
		cache.putIntoCache(4,"Product 4 info");
		
	}
	
}