package Exam;

class Person {
	private String pno;
	private String pname;
	private int age;
	
	//Person 생성자 디폴트형
	public Person () {
		pno = null;
		pname = null;
		age = 0;
	}
	//생성자 오버로딩 -> 같은 이름의 메소드를 다른 생성자를 통하여 중복선언 하는것
	public Person (String pn) {
	//디폴트형 호출	
		this();
		pno = pn;
	}
	//생성자 오버로딩
	public Person (String pn, String name) {
	//this 문구를 통하여 중복되는 문장 축약가능
		this(pn);
		pname = name;
	}
	//생성자 오버로딩
	public Person (String pn, String name, int a) {
		this(pn,name);
		age = a;
	}
	
	public void show () {
		System.out.println("번호 : " + pno + "\t이름 : " + pname + "\t나이 : " + age);
	}
	public String toString() {
		return "번호 : " + pno + "\t이름 : " + pname + "\t나이 : " + age + "\n";
	}
}

class Student extends Person {
	private String schoolname;
	private int schoolYear;
	
	public Student () {}
	public Student (String pn, String name, int a, String sname, int syear) {
		super(pn,name,a);
		schoolname = sname;
		schoolYear = syear;
	}
	
	//오버라이딩 -> 하위 클래스에서 부모클래스의 메소드를 재정의 하는것
	public void show () {
		super.show();
		System.out.println("학교명 : " + schoolname + "\t학년 : " + schoolYear);
	}
	
	public String toString() {
		return super.toString() + "학교명 : " + schoolname + "\t학년 : " + schoolYear + "\n";
	}
}

class WorkStudent extends Student {
	private String job;
	private int salary;
	
	public WorkStudent () {job = null; salary = 0;}
	public WorkStudent (String pn, String name, int a, String sname, int syear, String j, int pay) {
		super (pn, name, a, sname, syear);
		job = j;
		salary = pay;
	}
	public String toString() {
		return super.toString() + "직업 : " + job + "\t요금 : " + salary;
	}
	
	public void show () {
		super.show();
		System.out.println("직업 : " + job + "\t요금 : " + salary);
	}
	// 오버로딩
	public void show (int a) {
		System.out.println(toString() + "\n - String문을 통한 출력");
	}
	
}

public class ProcessPersons {
	static void display(Person[] p) {
		for(int i = 0; i < p.length; i++) {
			p[i].show();
			System.out.println("");
		}
		
	}
		public static void main(String[] args) {
		
		Person[] list;
		Person p = new Person();
		Person p1 = new Person("p001");
		Person p2 = new Person("p002", "hong");
		Person p3 = new Person("p003", "kim", 20);
		WorkStudent ws = new WorkStudent();
		WorkStudent ws2 = new WorkStudent("p001", "Hong", 30, "부산대",3,"code",1000);
		Student s1 = new Student("p004", "Lee" , 40 , "신라대", 5);
		list = new Person[] {p,p1,p2,p3,s1};
		
		display(list);
		ws2.show();
		
//		ws2.show(1);
//		System.out.println("");
//		s1.show();
	}

}
