package sample;

public class ReverseWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s=new String("Geeks");
		char[] ch=s.toCharArray();
		int start=0;
		int end=s.length()-1;
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
			
		}
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
	}

}
