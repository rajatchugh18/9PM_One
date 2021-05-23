package pkg1;

public class Inherit_Method_C extends Inherit_Method_P
{

	public void m1() {
		
		System.out.println("Child default method");
	}
	
	public void m2(int a) {
		System.out.println("Child 1 parameterized method");
	}
	
	public void m3(int a, int b) {
		System.out.println("Child 2 parameterized method");
	}
	
	public void m4(int a, int b, int c) {
		System.out.println("Child 3 parameterized method");
	}
	
	public void m5(int a, int b, int c, int d) {
		super.p5(1, 1, 1, 1);
		System.out.println("Child 4 parameterized method");
		this.m1();
		this.m3(1, 2);
		this.m4(1, 2, 1);
		this.m2(10);
	}
	
	public static void main(String[] args) {
		
		Inherit_Method_C obj = new Inherit_Method_C();
		obj.m5(1, 2, 3, 4);
	}

}
