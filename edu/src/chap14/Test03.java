package chap14;

interface Vertify { 
	boolean check(int n);
}

public class Test03 {
	public static void main(String[] args) {
		
		Vertify isEven = (n) -> (n%2) == 0;
		
		System.out.println(isEven.check(10));
		
		Vertify isPositive = (n) -> n>=0;
		
		System.out.println(isPositive.check(-2));
		
	}
}
