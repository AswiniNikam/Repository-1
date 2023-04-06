package src.som;

public class AdultUser {
	int age;
	String bookType;
	public AdultUser(int age, String booktype) {
		this.age=age;
		this.bookType=bookType;
	}
	public void registeAccount() {
		if(age>12) {
			System.out.println("You have successfully registered under an Adult Account");
		}else {
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
		}
	}
	public void requetsBook() {
		if(bookType.equals("Fiction")) {
			System.out.println("Book Issued successfully, please return the book within 7 days");
		}
		else {
			System.out.println("Oops, you are allowed to take only adult Fiction books");
		}
	}

}
