package com.src;

public class countNegativeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid= {{3,2},
		              {1,0}};
		int totalRow=grid.length;
        int totalCol=grid[0].length;
        int count=0;
        int row=0, col=grid[0].length-1;
        while(row<totalRow && col>=0){
            if(grid[row][col]>0){
                row++;
            }else {
            count=count+totalRow-row;
            col=col-1;
            }
        }
        System.out.println(count);
	}

}
