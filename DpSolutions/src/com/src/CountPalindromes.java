package com.src;

public class CountPalindromes {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] wt= {1,2,3,5};
		int[] pr= {1,4, 7, 10};
		int capacity=8;
		int[][]dp=new int[pr.length][capacity+1];
		for(int i=1;i<=capacity;i++) {
			dp[0][i]=1;
		}
		for(int i=1;i<wt.length;i++) {
			for(int j=1;j<=capacity;j++) {
				int including=0;
				int excluding=0;
				if(j>=wt[i]) {
					including=pr[i]+dp[i-1][j-wt[i]];
				}
				excluding=dp[i-1][j];
				dp[i][j]=Math.max(including, excluding);
			}
		}
		System.out.println(dp[wt.length-1][capacity]);
	}

}
