package OOPPractice;
class One1{
	public void print_greeks() {
		System.out.println("Geeks");
	}
	
}
class Two1 extends One{
	public void print_for() {
		System.out.println("Geeks");
	}
	
}
class Three extends Two{
	public void print_greeks() {
		System.out.println("Geeks");
	}
	
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three t1=new Three();
		t1.print_greeks();
		t1.print_for();
		t1.print_greeks();
	}

}
