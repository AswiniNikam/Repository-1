package sample;

public class Palindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= new String("ana");
		char[] strArr=str.toCharArray();
		String s="";
		int i=0,j=str.length()-1;
		while(i<j) {
			if(strArr[i]==strArr[j]) {
				i++;
				j--;
				
			}
		}
		if(i==j) {
			System.out.println("True");
		}
	}

}
