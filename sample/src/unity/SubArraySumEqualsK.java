package unity;

public class SubArraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {1,1,1};
		int i=0,j=0,cnt=0,sum=0,k=2;
       while(j<nums.length) {
			sum=sum+nums[j];
			if(sum<k) {
				j++;
			}else if(sum==k){
				cnt++;
				j++;
			}else if(sum>k) {
				while(sum>k) {
					sum=sum-nums[i];
					i++;
					if(sum==k) {
						cnt++;
						j++;
					}
				}
				
			}
		}
		System.out.println(cnt);
	}

}
