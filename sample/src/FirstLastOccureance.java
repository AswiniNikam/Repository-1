import java.util.ArrayList;

public class FirstLastOccureance {
	public int fistOccur(int start,int end,int mid,int no,int[] arr) {
		int index=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==no) {
				index=mid;
				end=mid-1;
			}else if(arr[mid]<no) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return index;
	}
	public int lastOccur(int start,int end,int mid,int no,int[] arr) {
		int index=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(arr[mid]==no) {
				index=mid;
				start=mid+1;
			}else if(arr[mid]<no) {
				start=mid+1;
			}else {
				end=mid-1;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  arr= {2,4,5,5,5,5,5,6,6};
		FirstLastOccureance b1=new FirstLastOccureance();
		int start=0,mid=0,end=arr.length-1,no=5;
		ArrayList<Integer> a=new ArrayList<Integer>(2);
		int firstOccur=b1.fistOccur(start,end,mid,no,arr);
		int lastOccur=b1.lastOccur(start,end,mid,no,arr);
		System.out.println(firstOccur);
		System.out.println(lastOccur);
		System.out.println("Count of number is"+ ((lastOccur-firstOccur)+1));

	}

}
