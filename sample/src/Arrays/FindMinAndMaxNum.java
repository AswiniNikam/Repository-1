package Arrays;

public class FindMinAndMaxNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {3,2,1};
		int gcd=0;
		int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
		for(int i=0;i<num.length;i++) {
			if(min>num[i]) {
				min=Integer.min(min, num[i]);
			}if(max<num[i]){
				max=Integer.max(max,num[i]);
			}
		}
		System.out.println("Minimum value"+min);
		System.out.println("Maximun value"+max);
		for(int i=1;i<=min&& i<=max;i++) {
			
			if(min%i==0 && max%i==0) {
				gcd=i;				
			}
		}
		System.out.println(gcd);
	}

}
