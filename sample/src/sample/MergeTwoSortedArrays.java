package sample;

import java.util.Arrays;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {3,27,38,43};
		int[] b= {9,10,82};
		int m=a.length-1;
		int n=b.length-1;
		int i=m;
		int j=0;
		int last1=0;
		int last2=0;
		while(i>=0&& j<=n) {
			if(a[i]>b[j]) {
				int temp=a[i];
				a[i]=b[j];
				b[j]=temp;
				i--;
				j++;
			}else {
				i--;
				j++;
			}
		}
		//a[3,27,10,9]
		//b[43,38,82]
		Arrays.sort(a);
		Arrays.sort(b);
		for(int l=0;l<a.length;l++){
			System.out.print(" "+a[l]);
		}
		System.out.println();
		for(int l=0;l<b.length;l++){
			System.out.print(" "+b[l]);
		}
		
		
		
	}

}
