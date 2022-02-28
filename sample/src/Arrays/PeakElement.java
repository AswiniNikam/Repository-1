package Arrays;

public class PeakElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2};
		int i=0,j=nums.length-1;
		int mid=0,index=0;
		while(i<=j){
			mid=(i+j)/2;
			if(mid>0 && mid<nums.length-1){
				if(nums[mid]>nums[mid+1]&&nums[mid]>nums[mid-1]){
					index=mid;
					break;
				}if(nums[mid+1]>nums[mid]){
					i=mid+1;
				}else{
					j=mid-1;
				}
			} 

			else if(mid==0){
				if(nums[0]>nums[1]){
					index= 0;
					break;

				}else{
					index= 1;
					break;

				}
			} else if(mid==nums.length-1){
				if(nums[nums.length-1]>nums[nums.length-2]){
					index= nums.length-1;
					break;

				}else{
					index= nums.length-2;
					break;

				}
			}
		}
		System.out.println(index);
	}



}
