package sample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<5;i++) {
		l1.add(new ArrayList<Integer>());
		}
		
		System.out.println(l1);
		
	}
	

}
