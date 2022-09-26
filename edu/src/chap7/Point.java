package chap7;

public class Point {
	/*Color Point에서 접근을 가능하게 하기위하여 private -> public으로 접근자를 변경함*/
	private int x,y;
	
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	
	}
	
	/*x,y값을 추출하기 위하여 get 메소드 선언 -> x,y값을 반환시킴*/
	public int getx () {
		return x;
	}
	
	public int gety () {
		return y;
	}
	
	public void getPoint () {
		System.out.println(" x : " + x + "\t y : " + y);
	}
	
	
}


