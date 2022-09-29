package Polumorophism;

public class Airplane extends Unit {
	
	public Airplane () {}
	
	public Airplane (String u) {
		super(u);
		System.out.println("[비행기] " + u + " Unit을 생성하였습니다." );
	}

	public void attack () {
		System.out.println(super.getu() + " Unit이 미사일을 발사하였습니다.");
	}

}
