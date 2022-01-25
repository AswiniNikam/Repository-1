package SlidingWindow;

public class RunningSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4};
		int[] res=new int[arr.length];
		int i=0,j=0,sum=0;
		while(j<arr.length) {
			sum=sum+arr[j];
			res[j]=sum;
			j++;
		}
		for(i=0;i<res.length;i++) {
			System.out.println(res[i]);
		}
	}

}
