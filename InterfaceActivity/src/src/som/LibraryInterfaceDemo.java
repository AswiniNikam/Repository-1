package src.som;

public class LibraryInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KidUser k1=new KidUser(10, "Kids");
		k1.registerAccount();
		KidUser k2=new KidUser(18, "Fiction");
		k2.registerAccount();
		AdultUser u1=new AdultUser(5, "kids");
		u1.registeAccount();
		AdultUser u2=new AdultUser(23, "Fiction");
		u2.registeAccount();
		
	}

}
