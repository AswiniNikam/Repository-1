package sample;


public class RemoveDuplicatesFromAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		int[] arr= {0,0,1,1,2,2,3};
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]!=arr[i+1]) {
				arr[j]=arr[i+1];
				j++;
			}
		}
		
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	System.out.println("Value of J is"+j);
	}

}
