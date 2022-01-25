package sample;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr={1,2,1,3,5,6,4};
		int i=0;
		int j=arr.length-1;
		int mid=0;
		int index=0;
		 while(i<j){
			 mid=(i+j)/2;
			 if(arr[mid]<arr[mid+1]) {
				 i=mid+1;
			 }else {
				 j=mid;
			 }
		 }
		 System.out.println(i);
	}
}