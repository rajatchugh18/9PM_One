package pkg1;

public class DayTwoAssignmentOne {

	public int sum(int a, int b) {
		int c;
		c=a+b;
		return c;
	}
	
	public int sub(int a, int b) {
		int c;
		c=a-b;
		return c;
	}
	
	public int mul(int a, int b) {
		int c;
		c=a*b;
		return c;
	}
	
	public int div(int a, int b) {
		int c;
		c=a/b;
		return c;
	}
	
	public static void main(String[] args) {
	
		DayTwoAssignmentOne s = new DayTwoAssignmentOne();
		int s1 = s.sum(10, 2);
		int s2 = s.sum(s1, 2);
		int s3 = s.sub(s2, 2);
		int s4 = s.mul(s3, 2);
		int result = s.div(s4, 2);
		
		System.out.println("Result of expression ((((10+2)+2)-2)*2)/2) is " + result);
		
	}

}
