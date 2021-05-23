package pkg1;

public class Inherit_Method_P {

	public void p1() {
		System.out.println("Parent default method");
	}
	
	public void p2(int a) {
		System.out.println("Parent 1 parameterized method");
	}
	
	public void p3(int a, int b) {
		System.out.println("Parent 2 parameterized method");
	}
	
	public void p4(int a, int b, int c) {
		System.out.println("Parent 3 parameterized method");
	}
	
	public void p5(int a, int b, int c, int d) {
		this.p4(1,2,3);
		this.p1();
		this.p2(1);
		this.p3(1, 2);
		System.out.println("Parent 4 parameterized method");
	}
}
