
public class FindMinInRotedArray {
	public static void main(String[] args) {
	int[] arr= {7,8,9,3,4,5,6};
	int start=0,high=arr.length-1,mid=0,min=-1;
	while(start<=high) {
		mid=(start+high)/2;
		if(mid==high) {
			min=arr[high];
			break;
		} else if(arr[mid]<arr[high]) {
			high=mid;
		}else {
			start=mid+1;
		}
		
	}
	System.out.println("Min is"+min);
	}

}
