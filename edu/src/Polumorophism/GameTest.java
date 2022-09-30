package Polumorophism;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class GameTest {
	public static void main(String[] args) {
		
		Unit u [];
		Tank tank = new Tank("Tank");
		Airplane air = new Airplane("Air");
		Submarine sub = new Submarine("Sub");
		Soldier kim = new Soldier("kim");
		//tank.attack();
		//tank.move();
		//air.move();
		System.out.println("=================");	
		tank.attack();
		air.attack();
		sub.attack();
		kim.attack();
		
		System.out.println("=================");	
		u = new Unit [] {tank, air, sub, kim};
		for (Unit b : u ) b.move();
		
		// 아래 컬렉션 형식은 자주쓰이므로 기억해둘것
		System.out.println("=================");
		{
			List<Unit> b = new ArrayList<>();
			b.add(new Tank("Tank"));
			b.add(new Airplane("air"));
			b.add(new Submarine("sub"));
			b.add(new Soldier("min"));
			System.out.println("=================");
			for (Unit c : b) c.attack();
		}
		{
			Vector<Unit> c = new Vector<>();
			c.add(new Tank("V:Ta"));
			c.add(new Airplane("V:air"));
			c.add(new Submarine("V:sub"));
			c.add(new Soldier("V:min"));
			System.out.println("=================");
			for (Unit d : c) d.move(); 
		}
	}
}
