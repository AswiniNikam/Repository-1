package sample;

import java.util.HashMap;
import java.util.Map;

public class FindMajorityOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,2,2,5,5,2,3,3};
		Map m1=new HashMap<Integer,Integer>();
		int num=0;
		for(int i=0;i<arr.length;i++) {
			if(!(m1.containsKey(arr[i]))) {
				m1.put(arr[i], 1);
			}else {
				int cnt=(int)m1.get(arr[i]);
				m1.put(arr[i], cnt+1);
				if((int)m1.get(arr[i])>arr.length/2) {
					 num=arr[i];
				}
			}
		
	}
		System.out.println(num);
	}
}
