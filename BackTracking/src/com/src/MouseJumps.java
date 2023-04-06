package com.src;

public class MouseJumps {
	public void printMazePath(int[][] maze) {
		if(!printMazePathUntill(maze, 0, 0)) {
			System.out.println("Can't find path");
		}
		print(maze);
		
	}
	public boolean printMazePathUntill(int[][]maze, int row, int col) {
		if(row==maze.length-1 && col==maze.length-1 && maze[row][col]==1) {
			maze[row][col]=2;
			return true;
		}
		if(safe(maze, row, col)) {
			maze[row][col]=2;
			if(printMazePathUntill(maze, row+1, col)) {
				return true;
			}
			if(printMazePathUntill(maze, row, col+1)) {
				return true;
			}
			
		}
		return false;
	}
	public boolean safe(int[][]maze, int row, int col) {
		if(maze[row][col]==1 && row>=0 && row<maze.length && col>=0 && col<maze.length) {
			return true;
		}
		return false;
	}
	public void print(int[][] maze) {
		for(int i=0;i<maze.length;i++) {
			for(int j=0;j<maze[i].length;j++) {
				System.out.print(maze[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseJumps rat = new MouseJumps(); 
		int maze[][] = {{1, 0, 0, 0}, 
                {1, 1, 1, 0}, 
                {1, 0, 1, 1}, 
                {0, 0, 0, 1} 
               }; 
		rat.printMazePath(maze);
		

	}

}
