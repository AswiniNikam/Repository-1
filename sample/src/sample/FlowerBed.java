package sample;

public class FlowerBed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] flowerBed= {1,0,0,0,1};
				
		int n=2;
		boolean flag=flowerBedCheck(flowerBed,n);
		System.out.println(flag);
		

	}
	public static boolean flowerBedCheck(int[] arr,int n) {
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==0) {
				int prev=(i==0||arr[i-1]==0)?0:1;
				int next=(i==arr.length-1||arr[i+1]==0)?0:1;
				if(prev==0&&next==0) {
					arr[i]=1;
					cnt++;
				}
			}
		}
		if(n<=cnt) {
			return true;
		
		}else {
			return false;
		}
			
		
}
}

