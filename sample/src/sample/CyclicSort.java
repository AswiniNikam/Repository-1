package sample;

public class CyclicSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {33,34,31,32,35};
		int min_no=31,temp=0;
		int i=0;
		while(i<arr.length) {
			if(arr[i]!=min_no+i) {
				int index=arr[i]-min_no;
				int x=arr[index];
				arr[index]=arr[i];
				arr[i]=x;
			}else {
				i++;
			}
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println(arr[j]);
		}
	}

}
