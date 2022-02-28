package Arrays;

import java.util.HashSet;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]nums = {100,4,200,1,3,2};
		int num=0;
		int cnt=0;
		int max=0;
		HashSet h1=new HashSet<Integer>();
		for(int i=0;i<nums.length;i++) {
			h1.add(nums[i]);
		}
		for(int i=0;i<nums.length;i++) {
			if(!(h1.contains(nums[i]-1))){
				 num=nums[i];
				 cnt=1;
			
			}while(h1.contains(num+1)) {
				num=num+1;
				cnt=cnt+1;
			}
			max=Math.max(max, cnt);
		}
		System.out.println(max);

	}

}
