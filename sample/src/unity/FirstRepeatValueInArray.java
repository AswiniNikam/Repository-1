package unity;

import java.util.HashSet;

public class FirstRepeatValueInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,4,4,3,5,7,2};
		int no=0;
		HashSet h1=new HashSet<Integer>();
		for(int i=arr.length-1;i>=0;i--) {
			if(h1.contains(arr[i])) {
				no=arr[i];
			}else {
				h1.add(arr[i]);
				
			}
		}
		System.out.println(no);
	}

}
