package chap7;

	/*Point Class를 상속하는 ColorPoint Class 작성*/
public class ColorPoint extends Point {
	
	private String color;
	
	
	public void setColor (int x, int y, String color) {
		setPoint(x, y);
		this.color = color;
		
	/*Point를 상속하여서 setPoint x,y값 선언 사용가능*/
		
	/*System.out.println("x : " + x + " y : " + y + " // color : " + color);*/
	}
	
	public String display () {
		return "x : " + x + " y : " + y + " // color : " + this.color;
	}
	
	
	
	/*오버라이딩 연습 */
	/*public void setColor2(String color) {
		this.color = color;
	}*/
	
	/*추출한 x,y값을 출력 // 부모함수 메소드를 통한 값에 접근하므로 해당 변수의 접근자는 public 으로 설정해야함*/
	/*this를 생략해도 출력결과 동일 */
	/*public void display2() {
		System.out.println("x : "+ this.x + " y : " + this.y + " // Color : " + color);
	}*/
	
	public static void main(String[] args) {
		
	}

}
