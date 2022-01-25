package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class ReturnMaxOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,2,1,4,5,3,6,7};
		int i=0,j=0,k=3,max=0;
		List l1=new ArrayList();
		while(j<arr.length) {
			if(j-i+1<k) {
				if(arr[j]>max) {
					max=arr[j];
				}
				j++;
			}else if(j-i+1==k) {
				if(arr[j]>max) {
					max=arr[j];
				}
				l1.add(max);
				i++;
				j++;
				
			}
		}
		System.out.println(l1);
		
	}

}
