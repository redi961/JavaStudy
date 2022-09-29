package Polumorophism;

public class Submarine extends Unit {

	public Submarine () {}
	
	public Submarine (String u) {
		super(u);
		System.out.println("[잠수함] " + u + " Unit을 생성하였습니다." );
	}


	public void attack () {
		System.out.println(super.getu() + " Unit이 어뢰를 발사합니다.");
	}
	
}
