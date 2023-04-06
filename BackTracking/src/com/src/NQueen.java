package com.src;

public class NQueen {
	public void nQueen(int n) {
		int[][] sol=new int[n][n];
		if(!nQueenUntill(sol,0)) {
			System.out.println("Can't solve");
		}
		print(sol);
	}
	public boolean nQueenUntill(int[][]sol, int col) {
		if(col>=sol.length) {
			return true;
		}
		for(int row=0;row<sol.length;row++) {
			if(safe(sol,row, col)) {
				sol[row][col]=1;
				if(nQueenUntill(sol,col+1)) {
					return true;
				}
				sol[row][col]=0;
			}
		}
		return false;
	}public boolean safe(int[][] sol, int row, int col) {
		for(int i=0;i<col;i++) {
			if(sol[row][i]==1) {
				return false;
			}
		}
		for(int i=row, j=col ; i>=0 && j>=0 ;i--,j--) {
			if(sol[i][j]==1) {
				return false;
			}
		}
		for(int i=row, j=col; i<sol.length && j>=0; i++,j--) {
			if(sol[i][j]==1) {
				return false;
			}
		}
		return true;
	}
	public void print(int[][]sol) {
		for(int i=0;i<sol.length;i++) {
			for(int j=0;j<sol.length;j++) {
				System.out.print(sol[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueen n=new NQueen();
		int no=4;
		n.nQueen(no);
		

	}

}
