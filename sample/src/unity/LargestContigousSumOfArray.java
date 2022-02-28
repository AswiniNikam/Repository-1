package unity;

public class LargestContigousSumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {-3,-4,4,-1,-2,1,5,-3};
		int max1=arr[0];
		int max2=arr[0];
		for(int i=1;i<arr.length;i++) {
			max1=Integer.max(max1, arr[i]+max1);
			max2=Integer.max(max1, max1);
		}
		System.out.println(max2);
		
	}

}
