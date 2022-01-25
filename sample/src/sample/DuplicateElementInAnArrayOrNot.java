package sample;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInAnArrayOrNot {

	public static void main(String[] args) {
		DuplicateElementInAnArrayOrNot d1=new DuplicateElementInAnArrayOrNot();
		
		int[] arr= {11,1,1,3,3,4,3,2,4,2};
		boolean b=d1.containDuplicates(arr);
		System.out.println(b);
	}
	public boolean containDuplicates(int[] nums) {

		// TODO Auto-generated method stub
		
		
		 Set s1=new <Integer>HashSet();
	        for(int i=0;i<nums.length;i++){
	            s1.add(nums[i]);
	        }
	        if(s1.size()==nums.length){
	            return false;
	        }else{
	            return true;
	        }
	        
        
	

	
		
	}

}
