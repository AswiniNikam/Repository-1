package com.src;

public class CurruptNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {2,6,4,4,3,2};
		int i = 0;
	    while(i < arr.length) {
	      if(arr[i] != arr[arr[i] - 1]) {
	        int otherIndex = arr[i] - 1;
	        
	        int x = arr[i];
	        arr[i] = arr[otherIndex];
	        arr[otherIndex] = x;
	      } else {
	        i++;
	      }
	    }
	    
	    for(i = 0; i < arr.length; i++) {
	      if(arr[i] != i + 1) {
	      System.out.println(arr[i]);
	      System.out.println(i+1);
	      }
	    }
	}

}
