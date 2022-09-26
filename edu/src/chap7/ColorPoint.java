package chap7;

public class ColorPoint extends Point {
	
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
	
	public void getColor() {
		System.out.println("현지 입력된 Color : " + color);
	}
	
	public static void main(String[] args) {
		
	}

}
