package String;

public class SubStringWithCommonPrefix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String prefix="flower";
		String str="flow";
	while(str.indexOf(prefix)!=0) {
		prefix=prefix.substring(0,prefix.length()-1);
		
	}
	System.out.println(prefix);
	}

}
