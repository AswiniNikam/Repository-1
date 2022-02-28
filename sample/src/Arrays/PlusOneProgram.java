package Arrays;

public class PlusOneProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digit= {1,2};
		int num=1;
		for(int i=0;i<digit.length-1;i++) {
			
			num=(num*10)+digit[i+1];
		}
		System.out.println("Number is"+num);
		num=num+1;
		System.out.println(num);
		while(num!=0) {
			int d=num%10;
			System.out.println("digits are"+d);
			num=num/10;
			
		}
	}

}
