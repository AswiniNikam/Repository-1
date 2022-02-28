package SlidingWindow;

import java.util.HashMap;

public class SubArrayWithKdistinctNumbers {
	public static void main(String[] args) {
		int [] array = {1,2,1,2,3}; 
		int k = 2;
		int i=0,j=0;
		int cnt=0;
		int val=0;
		HashMap<Integer, Integer> h1=new HashMap<Integer,Integer>();
		while(j<array.length)
		{	
			if(!(h1.containsKey(array[j]))) {
				h1.put(array[j], 1);
			}else {
				val=h1.get(array[j]);
				h1.put(array[j], val+1);
			}
			if(h1.size()<k) {
				j++;
			}
			else if(h1.size()==k) {
				while(i!=j&&h1.size()==k) {
					cnt++;
					if(!(h1.get(array[i])==0)) {
						val=h1.get(array[i]);
						h1.put(array[i],val-1);
						if(h1.get(array[i])==0) {
							h1.remove(array[i]);
						}
					}
					i++;
					j++;
				}
				
			}
		}
		System.out.println(cnt);
	}
}
