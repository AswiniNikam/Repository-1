package com.src;

import java.util.LinkedList;
import java.util.Queue;

class Coordinate{
	int x, y;
	public Coordinate(int x, int y) {
		this.x=x;
		this.y=y;
	}
}
public class RottenOrage {
	public static boolean isDelimeter(Coordinate c) {
		if(c.x==-1 && c.y==-1) {
			return true;
		}
		return false;
	}
	public static boolean isFresh(int x, int y, int[][]mat) {
		if(x<mat.length && x>=0 && y<mat[x].length && y>=0 && mat[x][y]==1) {
			return true;
		}
		return false;
	}
	public static int minTimeOfRottenOarnge(int[][] mat){
		Queue<Coordinate> q1=new LinkedList<>();
		boolean flag=false;
		int cnt=0;
		for(int i=0;i<mat.length;i++) {
			for(int j=0; j<mat[i].length;j++) {
				if(mat[i][j]==2) {
					q1.add(new Coordinate(i, j));
				}
			}
		}
		q1.add(new Coordinate(-1,-1));
		while(!q1.isEmpty()) {
			while(!isDelimeter(q1.peek())) {
				Coordinate c=q1.remove();
				if(isFresh(c.x-1, c.y, mat)) {
					mat[c.x-1][c.y]=2;
					q1.add(new Coordinate(c.x-1, c.y));
					if(!flag) {
						flag=true;
						cnt=cnt+1;
					}
				}
				if(isFresh(c.x, c.y-1, mat)) {
					mat[c.x][c.y-1]=2;
					q1.add(new Coordinate(c.x, c.y-1));
					if(!flag) {
						flag=true;
						cnt=cnt+1;
					}
				}
				if(isFresh(c.x+1, c.y, mat)) {
					mat[c.x+1][c.y]=2;
					q1.add(new Coordinate(c.x+1, c.y));
					if(!flag) {
						flag=true;
						cnt=cnt+1;
					}
				}
				if(isFresh(c.x, c.y+1, mat)) {
					mat[c.x][c.y+1]=2;
					q1.add(new Coordinate(c.x, c.y+1));
					if(!flag) {
						flag=true;
						cnt=cnt+1;
					}
				}
			}
			q1.remove();
			flag=false;
			if(!q1.isEmpty()) {
				q1.add(new Coordinate(-1,-1));
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat = { 
		        { 0, 2, 0, 0, 2 },
		        { 0, 1, 0, 1, 1 },
		        { 0, 1, 0, 1, 2 },
		        { 2, 1, 0, 2, 0 }};
		
		int ans=RottenOrage.minTimeOfRottenOarnge(mat);
		System.out.println(ans);
	}

}
