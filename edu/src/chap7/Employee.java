package chap7;
class Person {
	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept (String dept) {
		this.dept = dept;
	}
	
}
public class Employee {

	private String name;
	private int age;
	private String dept;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge (int age) {
		this.age = age;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept (String dept) {
		this.dept = dept;
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setAge(10);
		Person p = new Person();
		System.out.println("Age : " + e.getAge());
		Employee e2 = new Employee();
		Student st = new Student();
		st.setAge(15);
		System.out.println("Student Age : " + st.getAge());
		
	}
}
