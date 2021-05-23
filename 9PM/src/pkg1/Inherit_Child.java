package pkg1;

public class Inherit_Child extends Inherit_Parent
{

	public Inherit_Child() {
		this(1,2,3,4);
		System.out.println("Child default constructor");
	}
	
	public Inherit_Child(int a) {
		this(1,2,3);
		System.out.println("Child 1 parameterized constructor");
	}
	
	public Inherit_Child(int a, int b) {
		this();
		System.out.println("Child 2 parameterized constructor");
	}
	
	public Inherit_Child(int a, int b, int c) {
		this(1,2);
		System.out.println("Child 3 parameterized constructor");
	}
	
	public Inherit_Child(int a, int b, int c, int d) {
		super(1,2,3,4);
		System.out.println("Child 4 parameterized constructor");
	}
	
	
	public static void main(String[] args) {
		Inherit_Child obj = new Inherit_Child(1);

	}

}
