package sample;

import java.util.Arrays;

public class StoneWeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stones= {3,7,2};
		int num=0;
        if(stones.length==1){
           System.out.println(stones[0]);
        }else{
            Arrays.sort(stones);
            int w1=stones[stones.length-1];
            int w2=stones[stones.length-2];
            if(w1==w2){
                System.out.println(num);
            }else{
                num=Math.abs(w1-w2);
                w1=num;
            }
        }
     System.out.println(num);
	}

}
