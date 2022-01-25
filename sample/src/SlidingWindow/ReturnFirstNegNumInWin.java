package SlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class ReturnFirstNegNumInWin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,-1,3,-3,-4,6,7,2};
		int i=0,j=0,k=3,l=0;
		boolean flag=false;
		List l1=new ArrayList<Integer>();
		while(j<arr.length) {
			if(arr[j]<0) {
				l1.add(arr[j]);
				
			}if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
				if(l1.size()==0) {
					System.out.println(0);
				}else {
					System.out.println(l1.get(0));
					if(arr[i]==(int)l1.get(0)) {
						l1.remove(0);
					}
				}
					i++;j++;
			}
		}
	}

}
