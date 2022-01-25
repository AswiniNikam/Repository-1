package sample;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,5};
		int n=5;
	int sum1=0,sum2=0;
        for(int i=0;i<array.length;i++){
            sum1=sum1+array[i];
            
        }
        for(int j=0;j<=n;j++){
            sum2=sum2+j;
        }
        System.out.println(sum2);
        System.out.println(sum1);
        System.out.println(sum2-sum1);
    }

	}


