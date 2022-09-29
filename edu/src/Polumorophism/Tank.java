package Polumorophism;

public class Tank extends Unit {
	
	public Tank () {}
	
	public Tank (String u) {
		super(u);
		System.out.println("[탱크] " + u + " Unit을 생성하였습니다." );
	}

	public void attack () {
		System.out.println(super.getu() + " Unit이 포를 사용하였습니다.");
	}
}
