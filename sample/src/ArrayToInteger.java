import java.util.ArrayList;

public class ArrayToInteger {
	public static void main(String[] args) {
		int[] num= {1,2,0,0};
		int no=0,k=34;
		for(int i=0;i<num.length;i++) {
			no=no*10+num[i];
		}
		no=no+k;
		int[] res=new int[num.length];
		int index=num.length-1;
		while(no!=0) {
			int digit=no%10;
			res[index]=digit;
			index--;
			no=no/10;
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(res[i]);
		}
		
	}

}
