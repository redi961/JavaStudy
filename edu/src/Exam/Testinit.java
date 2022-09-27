package Exam;

import java.util.Scanner;

public class Testinit {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();
	
		Testing t1 = new Testing();
		t1.setNum1(a);
		t1.setNum2(b);
		t1.print();
	
		
		// 메소드 호출 (오버로딩)
		Testing t2 = new Testing(a,b);
		t2.print();
	}
}
