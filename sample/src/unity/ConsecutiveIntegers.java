package unity;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class ConsecutiveIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,2,3,3};
		int k=3;
		HashMap<Integer,Boolean> h1=new HashMap<Integer,Boolean>();
		for(int i=1;i<=3;i++) {
			h1.put(arr[i],false);
		}
		for(int i=0;i<arr.length;i++) {
			if(h1.containsKey(arr[i])) {
				h1.put(arr[i],true);
			}else {
				System.out.println("Number is not present");
			}
		}
		for(Map.Entry<Integer,Boolean>entry:h1.entrySet()) {
			if(entry.getValue()==true) {
				System.out.println("Value is present");
			}else {
				System.out.println("Value is not present");
			}
			
		}
		
	}

}
