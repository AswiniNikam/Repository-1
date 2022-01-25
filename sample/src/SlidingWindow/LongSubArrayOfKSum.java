package SlidingWindow;

public class LongSubArrayOfKSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,3,1,1,1,1,1};
		int i=0,j=0,k=5,sum=0,size=0,max=0;
		while(j<arr.length) {
			sum=sum+arr[j];
			if(sum<k) {
				j++;
			}else if(sum==k) {
				size=j-i+1;
				max=Integer.max(max,size);
				j++;
			}else if(sum>k) {
				while(sum>k) {
					sum=sum-arr[i];
					i++;
				}
				j++;
			}
		}
		System.out.println(size);
		
	}

}
