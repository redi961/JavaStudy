package P283;

public class Employee extends Person{

	private String dept;
	
	public Employee () {}
	
	public Employee (String n, int a, String d) {
		super(n,a);
		dept = d;		
	}
	public String toString() {
		return super.toString()+" 부서 : " + dept;
	}
	public void show () {
		System.out.println(toString());
	}
}
