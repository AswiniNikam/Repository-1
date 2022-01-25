package sample;

public class LeetcodeBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		int money=0;
		int inc=0;
		while(n>0) {
		for(int i=1;i<8;i++) {
			money=money+i+inc;
			n--;
			if(n==0) {
				System.out.println("Money is"+money);
				break;
			}
		}
		inc++;
		}
		
		System.out.println(money);
	}

}
