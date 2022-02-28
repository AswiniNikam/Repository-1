package OOPPractice;
class Family{
	private final String address="San Francisco";
	
	public String getAddress() {
		return address;
	}
}
interface Father{
	String name="John";
}
interface Mother{
	String name="Nancy";
}
class Son extends Family implements Father,Mother{
	private String name="Frank";
	public String getSonName() {
		return name;
	}
	public String getFatherName() {
		return Father.name;
	}
	public String getMotherName() {
		return Mother.name;
	}
	

}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Son s1=new Son();
		System.out.println("Address of family is");
		System.out.println(s1.getAddress());
		System.out.println("Father name is");
		System.out.println(s1.getFatherName());
		System.out.println("Mother name is");
		System.out.println(s1.getMotherName());
	}

}
