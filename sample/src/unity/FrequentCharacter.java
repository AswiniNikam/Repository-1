package unity;

public class FrequentCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		int[] occur=new int[26];
		for(char ch: s.toCharArray()) {
			occur[ch-'a']++;
		}
		char best_char='a';
		int best_res=0;
		for(int i=1;i<26;i++) {
			if(occur[i]>=best_res) {
				best_char=(char)((int)'a'+i);
				best_res=occur[i];
				if(best_res>1) {
					best_char=best_char;
					break;
				}
			}
		}
		System.out.println(Character.toString(best_char));
	}

}
