package sample;

public class StickProblem2 {

	public static void main(String[] args) {
		int A=1,B=2;
		StickProblem2 s2=new StickProblem2();
		int num=s2.solution(A,B);
		System.out.println("size"+" "+num);
	}
	public int solution(int a,int b) {
		int firstCase=a/4;
		int secondCase=min(a,b/3);
		int thirdCase=min(a/2,b/2);
		int forthCase=min(a/3,b);
		int fifthCase=b/4;
		return max(firstCase,max(firstCase,max(secondCase,max(thirdCase,max(forthCase,fifthCase)))));
	}
	public int min(int a,int b) {
		if(a<b) 
			return a;
		else 
			return b;
	}
	public int max(int a,int b) {
		if(a>b) 
			return a;
		else
			return b;
	}
}
