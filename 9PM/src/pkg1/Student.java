package pkg1;

public class Student {

	int roll_num;
	int age;
	public void display1() {
		System.out.println("Welcome All");
	}
	public void display2() {
		System.out.println("Automation is easy");
	}
	
	public static void main(String[] args) 
	{	
		Student obj = new Student();
		obj.display1();
		obj.display2();
		obj.age=18;
		System.out.println("Age is: " + obj.age);
		obj.roll_num=007;
		System.out.println("Roll number is: " + obj.roll_num);
	}

}
