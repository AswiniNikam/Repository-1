package unity;

public class EquilibriumPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,2,2,6,4,2};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			sum=sum-arr[i];
			if(sum==arr[i]) {
				System.out.println(arr[i]);
			}
		}
	}

}
