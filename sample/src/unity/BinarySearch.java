package unity;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,7,9,15,50};
		int i=0,j=arr.length-1;
		int mid=0;
		int key=15;
		while(i<j) {
			mid=(i+j)/2;
			if(arr[mid]==key) {
				System.out.println("Element is at index"+" "+mid);
				break;
			}else if(key>arr[mid]) {
				i=mid+1;
			}else if(key<arr[mid]) {
				j=mid-1;
			}else {
				System.out.println("Element is not found");
			}
			
			}
		
	}

}
