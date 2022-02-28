package unity;

import java.util.ArrayList;

public class MaxOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,5,1,6,7,3,5,8};
		int k=3;
		int max=Integer.MIN_VALUE;
		int i=0,j=0;
		ArrayList l1 =new ArrayList<Integer>();
		while(j<arr.length) {
			if(j-i+1<k) {
				if(max<arr[j]) {
					max=Integer.max(max,arr[j]);
				}
				j++;
			}else if(j-i+1==k) {
				if(max<arr[j]) {
					max=Integer.max(max,arr[j]);
					l1.add(max);
				}else {
					l1.add(max);
				}
				j++;
			}else if(j-i+1>k) {
				i++;
			}
		}
		System.out.println(l1);
	}

}
