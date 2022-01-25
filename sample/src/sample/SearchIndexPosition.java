package sample;

public class SearchIndexPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,3,5,6};
		int target=2;
		int index=0;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==target) {
				index=i;
				break;
			}
			else {
				if(arr[i]>target) {
					index=i;
					break;
				}
			}
			index=i+1;
		}
		System.out.println(index);
	}

}
