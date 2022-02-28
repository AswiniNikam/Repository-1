package Arrays;

public class SwapSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int[] nums={3,0,1};
		int i=0;
        while(i<nums.length) {
        	if(nums[i]!=i) {
        		int temp=i;
        		i=nums[i];
        		nums[i]=temp;
        		
        		
        	}
        }

	}

}
