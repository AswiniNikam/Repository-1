package SlidingWindow;

public class ReturnMaxsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr= {2,5,1,18,2,9,1};
		int k=3;
		int i=0,j=0;
		int sum=0;
		int begin=0;
		int end=0;
		int max=Integer.MIN_VALUE;
		
		while(j<arr.length) {
			sum=sum+arr[j];
			if((j-i)+1<k) {
				j++;
			}else if((j-i+1)==k) {
//				max=Math.max(max,sum);
				if(sum>max) {
					max=sum;
					begin=i;
					end=j;
				}
				sum=sum-arr[i];
				i++;
				j++;
				
			}
			
		}
		System.out.println(max);
		System.out.println(begin+" "+end);
	
		
		

	}

}
