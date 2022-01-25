package sample;

import java.util.HashMap;
import java.util.Map;

public class ProfitTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] stockProfit= {5,7,9,13,11,6,6,3,3};
		int target=12;
		int cnt=0;
		int comp=0;
		Map m1=new HashMap<Integer,Integer>();
		for(int i=0;i<stockProfit.length;i++) {
			comp=target-stockProfit[i];
			if(m1.containsKey(comp)&& (int)m1.get(comp)==1){
				int val=(int) m1.get(comp);
				m1.put(comp,val-1);
				cnt++;
			}else {
				m1.put(stockProfit[i], 1);
			}
		}
		System.out.println(cnt);
		System.out.println(m1);
	}

}
