package P283;

public class Professor extends Person{

	private String subject;
	
	public Professor() {}
	
	public Professor(String n, int a, String s) {
		super(n,a);
		subject = s;
	}
	public String toString() {
		return super.toString()+" 과목 : " + subject;
	}
	public void show () {
		System.out.println(toString());
	}	
}
