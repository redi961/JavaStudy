package Polumorophism;

public class Soldier extends Unit {

	public Soldier () {}
	
	public Soldier (String u) {
		super(u);
		System.out.println("[보병] " + u + " Unit을 생성하였습니다." );
	}


	public void attack () {
		System.out.println(super.getu() + " Unit이 총을 발사합니다.");
	}
	
}
