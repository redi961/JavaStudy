package com.ruby.java.test1;

class Student {
	private int sno;
	private String name;
	private float weight;
	public Student () {
		System.out.println("생성자 호출");
	}
	public Student (int n, String s, double d) {
		sno = n;
		name = s;
		weight = (float)d;
	}
	
	
	
	public void getStudent (int sno, String name, float weight) {
		this.sno = sno;
		this.name = name;
		this.weight = weight;
	}
	
	public void display () {
		System.out.println("학생이름 : " + name + "\t 학번 : " + sno + "\t 무게 : " +  weight + "Kg");
	}
	
}

public class ProcessStudent {
	public static void main(String[] args) {
		Student st = new Student();
		st.getStudent(20141694, "문상현", (float)62.47);
		st.display();
		
	}

}
