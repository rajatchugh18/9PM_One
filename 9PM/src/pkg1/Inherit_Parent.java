package pkg1;

public class Inherit_Parent {

	public Inherit_Parent() {
		this(1,2,3);
		System.out.println("Parent default constructor");
	}
	
	public Inherit_Parent(int a) {
		this();
		System.out.println("Parent 1 parameterized constructor");
	}
	
	public Inherit_Parent(int a, int b) {
		this(1);
		System.out.println("Parent 2 parameterized constructor");
	}
	
	public Inherit_Parent(int a, int b, int c) {
		System.out.println("Parent 3 parameterized constructor");
	}
	
	public Inherit_Parent(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("Parent 4 parameterized constructor");
	}
}
