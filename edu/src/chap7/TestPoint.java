package chap7;

public class TestPoint extends Point {

	public static void main(String[] args) {
		ColorPoint c = new ColorPoint();
		
		/*Color Point는 Point를 상속중이므로 Point Class의 메소드를 사용 가능함*/
		c.setColor(35, 55,"blue");
		c.Show();
		
		c.setColor(90,80,"red");
		c.Show();
		
		/*c.setPoint(50, 80);*/
		/*c.setColor2("Red");*/
		/*c.display2();*/
		
	}
}
