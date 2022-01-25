package sample;

public class BalancedCellArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,7,3,6,5,6};
		int sum=0,lSum=0,rSum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		rSum=sum;
		for(int i=0;i<arr.length;i++) {
			rSum=rSum-arr[i];
			if(rSum==lSum) {
				System.out.println(i);
			}
			lSum=lSum+arr[i];
		}
		System.out.println(-1);
		
	}

}
