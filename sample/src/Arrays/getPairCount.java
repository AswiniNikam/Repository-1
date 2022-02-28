package Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class getPairCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1, 5,7,1};
		int k=6;
		HashMap<Integer,Integer> h1=new HashMap<Integer,Integer>();
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            int com=k-arr[i];
            if(!(h1.containsKey(com))){
                h1.put(arr[i],1);
            }else{
            	int val=h1.get(arr[i]);
                cnt=cnt+val;
            	int v=h1.get(arr[i]);
            	h1.put(arr[i], v+1);
                
            }
        }
        System.out.println("count is"+cnt);
	}

}
