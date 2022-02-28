package sample;
class Animals{
	public void walk() {
		System.out.println("Walk from animals");
	}
	
	public void communication() {
		System.out.println("communication from animals");
	}
}
class Cat extends Animals{
	public void walk() {
		System.out.println("Walk from cat");
		super.walk();
	}
	public void meow() {
		System.out.println("meow from animals");
	}
}
	


public class MainClass {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c1=new Cat();
		c1.walk();
		c1.communication();
		c1.meow();
		
	}

}
