package sample;

import java.util.HashMap;
import java.util.Map;

public class KDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a= {1,2,3,4,5};
		int k=1;
		int count=0;
		HashMap<Integer,Integer> h1 =new HashMap();
		for(int i=0;i<a.length;i++) {
			if((!h1.containsKey(a[i]))) {
				h1.put(a[i], 1);
			}else {
				int cnt=h1.get(a[i]);
				h1.put(a[i],cnt+1);
			}
		}
		for(int i:h1.keySet()) {
			if(k!=0) {
				int b=i+k;
				if(h1.containsKey(b)) {
					count++;
				}
			}else {
				if(h1.get(i)>1)
				count++;	
			}
		}
System.out.println(count);
	}

}
