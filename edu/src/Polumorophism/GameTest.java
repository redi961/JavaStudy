package Polumorophism;

import java.util.ArrayList;
import java.util.List;

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
		
		System.out.println("=================");
		{
			List<Unit> b = new ArrayList<>();
			b.add(new Tank("Tank"));
			b.add(new Airplane("air"));
			b.add(new Submarine("sub"));
			b.add(new Soldier("min"));
			for (Unit c : b) {
				c.attack();
			}
		}
		

	}
}
