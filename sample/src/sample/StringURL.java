package sample;

import java.util.ArrayList;
import java.util.List;

public class StringURL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<String>> listOfLists = new ArrayList<>();
		List<List<String>> listOfListsResult = new ArrayList<>();
		String size="";
		String max="none";
		String unit="";
		int sizeInt=0;
		int maxSize=0;
		String inputURL="";
		List innerList=null;
		for(int i=0;i<1;i++) {
			 innerList=new ArrayList<String>();
			innerList.add("https://svs.gsfc.nasa.gov/vis/a030000/a030800/a030877/frames/5760x3240_16x9_01p/BlackMarble_2016_928m_conus_labeled.png");
			innerList.add("98000");
		}
		listOfLists.add(innerList);
		System.out.println(listOfLists);
		for(int i=0;i<listOfLists.size();i++) {
			inputURL=listOfLists.get(i).get(0);
			 size=listOfLists.get(i).get(1);
			 sizeInt=Integer.parseInt(size);
			unit=max.substring(max.length()-2,max.length());
			if(unit.equals("MB")) {
				 maxSize=Integer.parseInt(max.substring(0,max.length()-2));
				 maxSize=maxSize*1000000;
			}else if(unit.equals("KB")){
				maxSize=Integer.parseInt(max.substring(0,max.length()-2));
				 maxSize=maxSize*1000;	
			}else if(unit.equals("GB")){
				maxSize=Integer.parseInt(max.substring(0,max.length()-2));
				 maxSize=maxSize*1000000000;
			}else if(max.equals("none")) {
				maxSize=1000000;
			}
			if( sizeInt<maxSize) {
				List<String> sample=new ArrayList<>();
				sample.add(inputURL);
				sample.add("TRUE");
				listOfListsResult.add(sample);
			}
			else {
				List<String> sample=new ArrayList<>();
				sample.add(inputURL);
				sample.add("FALSE");
				listOfListsResult.add(sample);
			}
			 
			
		}
		System.out.println(sizeInt);
		
		System.out.println(maxSize);
		System.out.println(listOfListsResult);
		
		
	}

}
