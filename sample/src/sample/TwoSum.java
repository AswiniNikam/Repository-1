package sample;

import java.util.HashMap;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int[] arr= {3,2,4};
		int target=6;
		int [] arr1=new int[2];
		HashMap h1=new HashMap<Integer,Integer>();
		for(int i=0;i<arr.length;i++) {
			int comp=target-arr[i];
			if(h1.containsKey(comp)) {
				arr1[0]=(int) h1.get(comp);
				arr1[1]=i;
			}
			h1.put(arr[i], i);
		}
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);*/
	
		int p1=0;
		String[]  s= {"abc", "bca", "dbe"};
		for(int i=0;i<s.length;i++) {
			for(int j=i+1;j<s.length;j++) {
				while(p1<s[i].length()) {
				if(s[i].charAt(p1)==s[j].charAt(p1)) {
					
					System.out.println(i);
					System.out.println(j);
					System.out.println(p1);
					break;
				}else {
					p1++;
				}
				}
				
			}
			break;
		}
	}

}
