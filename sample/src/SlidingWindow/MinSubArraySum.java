package SlidingWindow;

public class MinSubArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,2,3,4,5};
		int target=11;
		int min=Integer.MAX_VALUE,i=0,j=0,sum=0;
        while(j<nums.length){
            sum=sum+nums[j];
            if(sum<target){
                j++;
            }else if(sum==target){
                if(j-i+1<min){
                    min=j-i+1;
                }
                j++;
            }
            else if(sum>target){
                while(sum>target){
                    sum=sum-nums[i];
                    i++;
                }if(sum==target) {
                	if(j-i+1<min){
                       min=j-i+1;
                    }
                }
                j++;
            }
        }System.out.println(min);
        System.out.println(Integer.MAX_VALUE);
        if(min==Integer.MAX_VALUE) {
        	min=0;
        }
        System.out.println(min);

	}

}
