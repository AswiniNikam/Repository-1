package Arrays;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int target=-1;
		int[] numbers= {-1,0};
		int[] res=new int[2];
        int i=0,j=numbers.length-1;
        while(i<j){
            if(numbers[i]+numbers[j]==target){
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
           else if(numbers[i]+numbers[j]>target){
                j--;
            }
           else if(numbers[i]+numbers[j]<target) {
        	   i++;
           }
        }
        for( i=0;i<res.length;i++) {
        	System.out.println(res[i]);
        }

	}

}
