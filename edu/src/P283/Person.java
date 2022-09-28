package P283;

public class Person {
	private String name;
	private int age;
	
	public Person () {}
	
	public Person (String n, int a) {
		name = n;
		age = a;
	}
	
	public String toString() {
		return "이름 : " + name + " 나이 : " + age;
	}
	
	public void show() {
		System.out.print(toString());
	}
}
