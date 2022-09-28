package chap07_01;

public class Student {
	
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
		/*Emplyoee Class에서 만들어진 Person Class 호출 가능*/
		Person p = new Person();
		p.setAge(25);
		System.out.println("Age : " + p.getAge());
	}

}
