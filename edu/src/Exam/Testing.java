package Exam;
import java.util.Scanner;

public class Testing {
	
	private int num1;
	private int num2;

	// 아래 오버로드 메소드 생성으로 인하여 디폴트 생성자 생성
	public Testing () {
		
	}
	
	// 메소드 오버로딩 -> 아래 SetNumber 축약됨
	public Testing (int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public static void main(String[] args) {
		// Ctrl + Shfit + o -> 임포트 단축키
		Scanner sc = new Scanner(System.in);
		
		System.out.print("A : ");
		int a = sc.nextInt();
		System.out.print("B : ");
		int b = sc.nextInt();
	
		Testing test = new Testing();
		test.num1 = a;
		test.num2 = b;
		test.print();
	}
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

	public void print() {
		// 최소공배수 / 최대공약수를 유클리드 호제법을 통하여 구함
		// num1 : a; num : b;
		int max;
		int min;
		
		if (num1 < num2) {
			max = num1;
			min = num2;
		} else {
			max = num2;
			min = num1;
		} 
		int rem = max%min;
		
		while(rem != 0) {
			max = min;
			min = rem;
			rem = max%min;
		}
		if (min == 1) {
			System.out.println("최대공약수 : 서로소");
		} else {
			System.out.println("최대공약수 : " + min);
		}
		System.out.println("최소공배수 : " + (num1*num2)/min);
	}
}
