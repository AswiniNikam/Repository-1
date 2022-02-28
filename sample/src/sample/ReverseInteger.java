package sample;

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-123;
		int o_num=num;
		long rev=0;
		
		while(num!=0) {
			int digit=num%10;
			rev=rev*10+digit;
			num=num/10;
		}
		System.out.println(rev);
		System.out.println(Integer.MAX_VALUE);
		System.out.println("1534236469");
	}

}
