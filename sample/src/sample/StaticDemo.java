package sample;

abstract class Calculate {
	

	abstract int add(int a,int b);
}
public class StaticDemo {
	public static void main(String[] arr) {
		int result= new Calculate()
		{
			int add(int a,int b) {
				return a+b;
			}
		}.add(11010,022011);
		System.out.println(result);
	}
	
}
