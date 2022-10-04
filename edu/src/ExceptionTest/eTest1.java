package ExceptionTest;


// Try : 예외 발생문에 대한 조사
// Catch : Try문 진행중 지정한 예외상황에 대한 실행문
// Finally : 예외 발생문 진행 후 마지막에 반드시 실행되는 구문

public class eTest1 {
	
	static void ePrint1() {
		try {
			int arr[] = new int[3];
			arr[0] = 1;
			arr[1] = 2;
			arr[2] = 3;
			//arr[3] = 4;
			System.out.println("OK");
			//Try문 실행중 Catch문에서 지정한 예외현상이 발생할 시 Catch문 실행
			//배열 범위 초과시 밠행하는 예외포인트
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
	
	static void ePrint2() {
		try {
			int a = 9;
			int b = 0;
			int c = a/b;
			System.out.println(c);
			//0으로 나눌때 발생하는 예외포인트
		}catch (ArithmeticException e) {
			System.out.println(e.getMessage() + " 분모가 0입니다.");
		}
	}
	
	static void ePrint3() {
		try {
			System.out.println("1");
			String s = null;
			s.length();
			System.out.println("2");
			System.out.println("3");
		}catch (Exception e) {
			System.out.println("오류 발생");
		}finally {
			System.out.println("OK");
		}
		System.out.println("4");
	}
	
	
	
	public static void main(String[] args) {
	
		ePrint3();
	
	}
}
