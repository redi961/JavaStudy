package Polumorophism;

public abstract class Unit  {
	
	private String uName;

	public Unit () {}
	
	public Unit (String u) {
		this.uName = u;		
	}
	
	public String getu() {
		return "["+uName+"]";
	}
	

	public void move () {
		System.out.println("["+uName+"] Unit이 이동하였습니다.");
	}
	
	abstract void attack ();
	
}
