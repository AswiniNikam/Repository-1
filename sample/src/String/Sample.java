package String;

public class Sample {
	public static void main(String[] str) {
	int [] nums= {3,2,2,3};
	int val=3;
	int k=0;
	int i=0;
	while(i<nums.length) {
		if(nums[i]==val) {
			i++;
		}
		else {
			nums[k]=nums[i];
			k++;i++;
		}
	}
	System.out.println(k);
	}
}
