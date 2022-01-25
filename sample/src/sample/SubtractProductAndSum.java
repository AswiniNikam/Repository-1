package sample;

public class SubtractProductAndSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=234;
		int product=1; 
		int sum=0;
		while(n!=0) {
			int d=n%10;
			n=n/10;
			 product=product*d;
			sum=sum+d;
		}
		System.out.println(product-sum);
		
	}

}
