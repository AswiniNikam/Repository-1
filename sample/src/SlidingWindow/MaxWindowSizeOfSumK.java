package SlidingWindow;

public class MaxWindowSizeOfSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,1,1,4};
		int i=0,j=0,sum=0,k=6,size=0,max=0;
		while(j<arr.length) {
			sum=sum+arr[j];
			if(sum<k) {
				j++;
			}else if(sum==k) {
				size=j-i+1;
				max=Integer.max(max,size);
				j++;
			}else if(sum>k) {
				
					sum=sum-arr[i];
					i++;
					if(sum==k) {
						size=j-i+1;
						max=Integer.max(max,size);
					}
					j++;
					
				
			}
		}
		System.out.println(max);
	}

	
}
