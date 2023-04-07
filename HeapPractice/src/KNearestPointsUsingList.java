package src;

import java.util.Collections;
import java.util.*;
import java.util.List;

class Coordinate{
	int x; int y;
	public Coordinate(int x, int y) {
		this.x=x;
		this.y=y;
	}
	public static  double getDistance(int x, int y) {
		double distance= (x*x) + (y*y);
		return distance;
	}
	public static List<Coordinate> getClosestPoints(List<Coordinate> list){
		Collections.sort(list,(n1,n2)->{
			
				return (int) (getDistance(n1.x, n1.y) - getDistance(n2.x, n2.y));
			
			
		});
		return list;
	}
}
public class KNearestPointsUsingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Coordinate c1 = new Coordinate(2, 3);
		    Coordinate c2 = new Coordinate(1, 4);
		    Coordinate c3 = new Coordinate(3, 5);
		    Coordinate c4 = new Coordinate(0, 4);
		    List<Coordinate> list=new ArrayList<>();
		    list.add(c1);
		    list.add(c2);
		    list.add(c3);
		    list.add(c4);
		    List<Coordinate> ans=Coordinate.getClosestPoints(list);
		   for(int i=0;i<ans.size();i++) {
			   System.out.println(ans.get(i).x +" "+ans.get(i).y);
		   }
		    

	}

}
