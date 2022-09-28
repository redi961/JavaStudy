package P283;

public class Student extends Person {
	private String major;
	
	public Student () {}
	
	public Student (String n, int a, String m) {
		super(n,a);
		major = m;
	}
	public String toString() {
		return super.toString() + " 과목 : " + major;
	}
	public void show () {
		System.out.println(toString());
	}
}
