package ArmorTest;

public class StaticMethodTest {
	static int num = 123;
	
	public static void main(String[] args) {
		StaticMethodTest.print1();
		StaticMethodTest exam = new StaticMethodTest();
		exam.print2();
	}

	public static void print1() {
		int num2 = num++;
		System.out.println("hello " + num2);
	}

	public void print2() {
		int num3 = ++num;
		System.out.println("java " + num3);
	}
}

