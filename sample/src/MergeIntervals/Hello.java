package MergeIntervals;

import java.util.ArrayList;
import java.util.List;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0,j=0,sum=0,max=0;
		int[] arr= {1,2};
		if(arr.length==1) {
			max=arr[0];
		}
		while(j<arr.length){
			sum=sum+arr[j];
			if(sum<max) {
				j++;
				
			}
			else if(max<sum) {
				max=sum;
				j++;
				
		}
			
		}
		if(arr.length==2&&arr[0]>arr[arr.length-1]&&max!=0) {
			max=arr[0];
		}else if(arr.length==2&&arr[arr.length-1]>arr[0]&&max!=0){
			max=arr[arr.length-1];
		}
		System.out.println(max);

	}

}
