package com.src;

public class IfSumExists {

	public static void main(String[] args) {
		String str = "bcacbf";
		boolean[][] dp=new boolean[str.length()][str.length()];
		int count=0;
		for(int i=0;i<str.length();i++) {
			dp[i][i]=true;
			count=count+1;
		}
		for(int i=dp.length-2;i>=0;i--) {
			for(int j=i+1;j<str.length();j++) {
				if(str.charAt(i)==str.charAt(j)) {
					if(dp[i+1][j-1] || j-i==1) {
						dp[i][j]=true;
						count=count+1;
					}
				}
			}
		}
		System.out.println(count);
	}

}
