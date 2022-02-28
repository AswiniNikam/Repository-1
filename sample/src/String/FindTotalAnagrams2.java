package String;

import java.util.ArrayList;
import java.util.HashMap;

public class FindTotalAnagrams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pat="aa";
		String txt="baa";
		ArrayList<Integer> l1=new ArrayList<Integer>();
		HashMap<Character,Integer> h1=new HashMap<Character,Integer>();
		for(int i=0;i<pat.length();i++) {
			char ch=pat.charAt(i);
			if(!(h1.containsKey(ch)))
	           h1.put(ch,1);
			else {
				int val=h1.get(pat.charAt(i));
				h1.put(ch,val+1);
			}
		}
		int i=0,j=0,cnt=0,ans=0,val=0,k=pat.length();;
		cnt=h1.size();
		while(j<txt.length()) {
			char ch=txt.charAt(j);
			if(h1.containsKey(ch)) {
				h1.put(ch,h1.get(ch)-1);
				if((int)h1.get(ch)==0) {
					cnt--;
				}
			}
			if(j-i+1<k) {
				j++;
			}else if(j-i+1==k) {
				if(cnt==0) {
					ans++;
					l1.add(i);
				}if(h1.containsKey(txt.charAt(i))) {
					h1.put(txt.charAt(i),(int)h1.get(txt.charAt(i))+1);
					if((int)h1.get(txt.charAt(i))==1) {
						cnt++;
					}
				}
				i++;
				j++;
			}
		}
		System.out.println(ans); 
		System.out.println(l1);
	}

}
