package sample;

public class Sort012 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {0,1,2,0,1,2};
		int l=0,m=0,h=arr.length-1,temp=0;
		while(m<=h) {
			if(arr[m]==0) {
				temp=arr[l];
				arr[l]=arr[m];
				arr[m]=temp;
				l++;
				m++;
			} else if(arr[m]==1) {
				m++;
			} else if(arr[m]==2) {
				temp=arr[m];
				arr[m]=arr[h];
				arr[h]=temp;
				h--;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
