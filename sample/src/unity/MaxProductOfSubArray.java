package unity;

public class MaxProductOfSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {12,34,45,6,13};
	
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		arr[arr.length-1]=0;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}

	}

}
