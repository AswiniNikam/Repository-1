package unity;

public class PrintElementGraterThanRightSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {14,15,8,9,5,2};
		for(int i= arr.length-2;i>0;i--) {
			if(arr[i]>arr[i+1]) {
				System.out.println(arr[i]);
			}
			
		}
		System.out.println(arr[arr.length-1]);
	}

}
