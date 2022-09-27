package chap7;



public class Point {
	/*Color Point에서 접근을 가능하게 하기위하여 private -> public으로 접근자를 변경함*/
	// 상속으로 변수 호출을 위하여 Protected 혹은 Default 형태로 설정해야함
	private int x,y;
	private String color;

	public Point () {}
	
	// 생성자 오버라이딩
	public Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setPoint (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void setColor (String color) {
		this.color = color;
	}
	
	/*x,y값을 추출하기 위하여 get 메소드 선언 -> x,y값을 반환시킴*/
	public int getx () {
		return x;
	}
	
	public int gety () {
		return y;
	}
	public String getc() {
		return color;
	}
	public void getPoint () {
		System.out.println(" x : " + x + "\t y : " + y);
	}
	
	
}


