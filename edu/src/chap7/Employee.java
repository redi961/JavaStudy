package chap7;
class Person {
	private String name;
	private int age;
	private String dept;
	
	public Person () {}
	public Person(String s, int a, String d) {
		name = s; age = a; dept = d;
		System.out.println();
	}
	
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
public class Employee extends Person {
	private String name;
	private int salary;
	private int age;
	private String dept;
	
	public Employee(String s, int a, String d, int pay) {
		super(s,a,d);
		System.out.println("Employee()::");
		salary = pay;
		
		
	}
	
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
		Employee e = new Employee("m", 1000, "d", 2000);
		e.setAge(10);
		Person p = new Person();
		System.out.println("Age : " + e.getAge());
		Student st = new Student();
		st.setAge(15);
		System.out.println("Student Age : " + st.getAge());
		
	}
}
