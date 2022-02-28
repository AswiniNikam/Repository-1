package sample;

abstract class Calculate2{
	abstract int add(int a,int b);
}
 class Result extends Calculate{
	int add(int a,int b) {
		return a+b;
	}
}
public class StaticD {
	public static void main(String[] arr) {
		Result r1=new Result();
		int result= r1.add(11010,022011);
		System.out.println(result);
	}
	
}
