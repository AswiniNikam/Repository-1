package unity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] str= {"eat","tea","tan","ate","nat","bat"};
		List s1=new ArrayList<String>();
		HashMap h1=new HashMap<String,String>();
		for(int i=0;i<str.length;i++) {
			char strArr[] =str[i].toCharArray();
			Arrays.sort(strArr);
			String str1=new String(strArr);
			if(!(h1.containsKey(str1))) {
				h1.put(str1, str[i]);
			}else {
				String val= (String) h1.get(str1);
				h1.put(str1, val+","+str[i]);
			}
			
		}
		System.out.println(h1);
		
	}

}
