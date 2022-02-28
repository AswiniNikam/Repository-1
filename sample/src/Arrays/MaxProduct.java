package Arrays;

import java.util.Arrays;

public class MaxProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,-2,4};
		int max1=arr[0],max2=arr[0];
		for(int i=1;i<arr.length;i++) {
			max1=Math.max(max1,arr[i]);
			max2=Math.max(max2,max1*arr[i]);
			
		}
		System.out.println(max2);

}
}
