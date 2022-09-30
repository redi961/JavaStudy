package Test;



abstract class Person {
	
	private String pnum;
	private String name;
	private int age;
	
	public Person() {};
	public Person(String pn, String n, int a) {
		this.pnum = pn;
		this.name = n;
		this.age = a;
	};
	
	abstract void show ();
	abstract void increase();
		
	public String toString() {
		return "학생번호 : " + pnum + " 학생이름 : " + name + " 나이 : " + age;
	}
}
 
 class Employee extends Person {
		
		private String job;
		private String dept;
		private int salary;
			
		public Employee () {}
		public Employee (String pn, String n, int a, String j, String de, int sal) {
			super(pn,n,a);
			this.job = j;
			this.dept = de;
			this.salary = sal;
		}
		
		public void show() {
			System.out.println(toString());
			System.out.println("=====================");
		}
		
		public void increase () {
			salary *= 1.1;
		}
		
		public String toString () {
			return super.toString() + "\n직업 : " + job + "부서 : " + "연봉 : " + salary + "만원";
		}
		
	}

  class Designer extends Employee {
 	
 	private String language;
 	private int WorkYear;
 	
 	public Designer () {}
 	public Designer (String pn, String n, int a, String j, String de, int sal, String lan, int y) {
 		super(pn, n, a, j, de, sal);
 		this.language = lan;
 		this.WorkYear = y;
 	}
 	
 	public void show() {
 		System.out.println(toString());
 		System.out.println("=====================");
 	}

 	public String toString () {
 	return super.toString() + "\n언어 : " + language + "부서 : " + "경력 : " + WorkYear + "차";
 	}
 	
 }

  class Student extends Person {
		
		private String schoolName;
		private int schoolyear;
		private int scholarship;
		
		public Student ( ) {}
		public Student (String pn, String n, int a, String sname, int sy, int ss) {
			super(pn,n,a);
			this.schoolName = sname;
			this.schoolyear = sy;
			this.scholarship = ss;
		}
		
		public void show() {
			System.out.println(toString());
			System.out.println("=====================");
		}
		public void increase () {
			scholarship *= 1.1;
		}
		
		public String toString() {
			return super.toString() + "\n학교명 : " + schoolName + " 학년 : " + schoolyear + " 장학금 : " + scholarship + "만원";
		}
	}
 
  class WorkStudent extends Student {
		
		private String job;
		private int dayPay;
		
		public WorkStudent() {}
		public WorkStudent(String pn, String n, int a, String sname, int sy, int ss, String j, int dp ) {
			super(pn,n,a,sname,sy,ss);
			this.job = j;
			this.dayPay = dp;
		}
		
		public void show() {
			System.out.println(toString());
			System.out.println("=====================");
		}
		
		public void increase () {
			super.increase();
			dayPay *= 1.1;
		}
		
		public String toString () {
			return super.toString() + "\n직업 : " + job + "부서 : " + "월급 : " + dayPay +"만원";
		}
		
	}
  

public class TestPersons  {
	
	static void showAll(Person p []) {
		for (int i = 0; i<p.length;i++) {
			p[i].show();
		}
	}
	static void increaseAll(Person p []) {
		for (int i = 0; i<p.length;i++) {
			p[i].increase();
		}
	}
	
	static void getData(Person p []) {
		Employee e = new Employee("p01","Hong", 20, "DB", "Design", 2000);
		Designer d = new Designer("p02", "Choi", 30, "Com", "Design", 2500, "한국어", 3);
		Student s = new Student("p03", "Jung", 23, "부경대", 3, 450);
		WorkStudent w = new WorkStudent("p04", "Jung", 23, "부경대", 3, 450, "편의점", 70);
		p[0] = e;
		p[1] = d;
		p[2] = s;
		p[3] = w;
	}
	
		
	public static void main(String[] args) {
		Person [] setP = new Person[4];
		getData(setP);
		showAll(setP);
		increaseAll(setP);
		showAll(setP);
		
	}
}
