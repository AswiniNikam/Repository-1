package com.src;
public class RatMazeProblem {
  

  
  public boolean sudokuAutomation(int[][] board, int n) {
	  int row=-1;
	  int col=-1;
	  boolean flag=true;
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<n;j++) {
			  if(board[i][j]==0) {
				  row=i;
				  col=j;
				  flag=false;
				  break;
			  }
		  }
		  if(!flag) {
			  break;
		  }
	  }
	 if(flag) {
		 return true;
	 }
	 for(int i=1;i<=n;i++) {
			 if(isSafePlace(board, row, col, i)) {
				 board[row][col]=i;
				 if(sudokuAutomation(board,n)) {
					 return true;
				 }else {
					 board[row][col]=0;
				 }
			 }
		 }
	 return false;
  }
  
  
  
  private boolean isSafePlace(int[][]n, int row, int col, int num) {
	  for(int i=0;i<n.length;i++) {
		  if(n[i][col]==num) {
			  return false;
		  }
	  }
	  
	  for(int i=0;i<n.length;i++) {
		  if(n[row][i]==num) {
			  return false;
		  }
	  }
	  int sqrt=(int)Math.sqrt(n.length);
	  int startRow=row-row%sqrt;
	  int startCol=col-col%sqrt;
	  for(int i=startRow;i<startRow+sqrt;i++) {
		  for(int j=startCol;j<startCol+sqrt;j++) {
			  if(n[i][j]==num) {
				  return false;
			  }
		  }
	  }
	  return true;
  }
  
  
  
  public static void printSudokuBoard(int[][] board, int N) { 
      for (int row = 0; row < N; row++) { 
          for (int col = 0; col < N; col++) { 
              System.out.print(board[row][col]); 
              System.out.print(" "); 
          } 
          System.out.println(); 
      } 
  } 
  


  public static void main(String[] args) {
	  RatMazeProblem a1=new RatMazeProblem();
	  int[][] a= {{0, 2, 3, 0},
              				{ 0, 0, 0, 1 },
              				{ 0, 1, 0, 0 },
              				{ 2, 4, 1, 0 }};
	  
	if(a1.sudokuAutomation(a,4)) {
	  a1.printSudokuBoard(a, 4);
	}else {
		System.out.println("No solution");
	}
        
  }

}