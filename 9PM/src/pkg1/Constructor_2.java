package pkg1;

public class Constructor_2 {

	public void method_1() 
	{
		this.method_5(1,2,3,4);
		System.out.println("Default method");
	}
	public void method_2(int a) {
		System.out.println("One parameterized method");
	}
	public void method_3(int a, int b) {
		System.out.println("Two parameterized method");
	}
	public void method_4(int a, int b, int c) {
		this.method_1();
		this.method_2(10);
		this.method_3(10,20);
		System.out.println("Three parameterized method");
	}
	public void method_5(int a, int b, int c, int d) {
		System.out.println("Four parameterized method");
	}
	
	
	public static void main(String[] args) {
		
		Constructor_2 obj = new Constructor_2();
		obj.method_4(1, 2, 3);
	}
	

}

//four parameterized method
//default method
//one parameterized method
//two parameterized method
//three parameterized method