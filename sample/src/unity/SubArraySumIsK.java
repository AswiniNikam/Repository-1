package unity;

public class SubArraySumIsK {
	public static void main(String[] args) {
		int[] arr= {4,2,5,3,1,8};
		int sum=9;
		int i=0,j=0;
		int sum1=0;
		int[] res=new int[2];
		while(j<arr.length) {
			sum1=sum1+arr[j];
			if(sum1<sum) {
				j++;
			}else if(sum1==sum) {
				res[0]=i;
				res[1]=j;
				break;
			}else if(sum1>sum) {
				while(sum1>sum) {
					sum1=sum1-arr[i];
					i++;
				}
				j++;
			}
		}
		for(int i1=0;i1<res.length;i1++) {
			System.out.println(res[i1]);
		}

	}

}
