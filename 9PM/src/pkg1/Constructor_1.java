package pkg1;

public class Constructor_1 {

	public Constructor_1() {
		this(1,2,3);
		System.out.println("Default constructor");
	}
	
	public Constructor_1(int a) {
		this();
		System.out.println("One parameterized constructor");
	}
	public Constructor_1(int a, int b) {
		this(1);
		System.out.println("Two parameterized constructor");
	}
	public Constructor_1(int a, int b, int c) {
		System.out.println("Three parameterized constructor");
	}
	public Constructor_1(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("Four parameterized constructor");
	}
	
	public static void main(String[] args) {
	
		Constructor_1 obj = new Constructor_1(1,2,3,4);
	}

}
