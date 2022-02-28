package OOPPractice;

class One{
	 int a=5;
	public void print_greek() {
		System.out.println("Greeks");
	}
	
}
class Two extends One{
	public void print_for() {
		System.out.println("for");
	
	}
}


public class SingleInheritance {
	public static void main(String[] arr) {
		Two t1=new Two();
		t1.print_greek();
		t1.print_for();
		t1.print_greek();
		
		
	}
	

}
