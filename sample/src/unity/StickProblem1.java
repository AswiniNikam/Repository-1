package unity;

public class StickProblem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StickProblem1 s1=new StickProblem1();
		int a=50,b=1;
		int size=s1.divideStick(a, b);
		System.out.println(size);
		
		

	}
	public static int divideStick(int a, int b) {
		int size=(a+b)/4; 
		if(size>0)
		return size;
		else 
			return 0;
		
		
	}

}
