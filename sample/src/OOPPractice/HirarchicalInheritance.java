package OOPPractice;
class A{
public void print_A() {
	System.out.println("In class A");
}
}class B extends A{
	public void print_B() {
		System.out.println("In class B");
		
	}
	
}class C extends A{
	public void print_C() {
		System.out.println("In class C");
		
	}
	
}class D extends A{
	public void print_D() {
		System.out.println("In class D");
		
	}
	
}
public class HirarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		b.print_A();
		b.print_B();
		System.out.println("-----------");
		C c=new C();
		c.print_A();
		c.print_C();
		System.out.println("-----------");
		D d =new D();
		d.print_A();
		d.print_D();

	}

}
