package sample;

import java.util.Arrays;

public class ParkingDilema {
	public static void main(String[] arr) {
		int[] cars= {1,2,3,10};
		int k= 4;
		ParkingDilema p1=new ParkingDilema();
		p1.carParkinRoof(cars, k);
		}
	public void carParkinRoof(int[] cars,int k) {
		Arrays.sort(cars);
		int min=Integer.MAX_VALUE;
		for(int i=0;i<cars.length-k+1;i++) {
			 min=Math.min(min, cars[i+k-1]-cars[i]);
			
		}
		System.out.println(min+1);
	}
}
