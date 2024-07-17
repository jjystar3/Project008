package typecasting;

public class Quiz01 {

	public static void main(String[] args) {
		
		Parent pc = new Child("한국", "고", "길동");
		
		System.out.println(pc.nationality + ", " + pc.lastName);
	}

}
class Parent {
	String nationality;
	String lastName;
	
	public Parent(String nationality, String lastName) {
		this.nationality = nationality;
		this.lastName = lastName;
	}
	
}

class Child extends Parent {
	String firstName;

	public Child(String nationality, String lastName, String firstName) {
		super(nationality, lastName);
		this.firstName = firstName;
	}
	
}