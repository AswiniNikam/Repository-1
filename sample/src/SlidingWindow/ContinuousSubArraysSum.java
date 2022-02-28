package SlidingWindow;

public class ContinuousSubArraysSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0,j=0,sum=0;
		int[] nums= {23,2,4,6,7};
		int k=6;
        while(j<nums.length){
            sum=sum+nums[j];
            if(sum/k!=0){
                j++;
            } if(sum/k==0){
               System.out.println("true");
               break;
            } if(j==nums.length-1&&sum/k!=0){
            	while(sum/k!=0) {
            	sum=sum-nums[i];
            	if(sum/k==0) {
            		System.out.println("true");
            		break;
            	}else {
            		System.out.println("false");
            	}
                i++;
            	}
                j=i;
                break;
            }
        }
        System.out.println("false");
	}

}
