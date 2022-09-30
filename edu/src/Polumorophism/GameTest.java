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
		
		// 아래 컬렉션 형식은 자주쓰이므로 기억해둘것 / Vector와 ArrayList는 기본적인 정의는 동일함
		// 어레이 리스트는 단일쓰레드 형식의 프로그램에 최적화되어 자주 사용됨
		System.out.println("=================");
		{
			List<Unit> b = new ArrayList<>();
			b.add(new Tank("A:Tank"));
			b.add(new Airplane("A:air"));
			b.add(new Submarine("A:sub"));
			b.add(new Soldier("A:min"));
			b.remove(2);
			System.out.println("=================");
			for (Unit c : b) {
				c.attack();	
			}
			System.out.println("=================");
		}
		{
		// 벡터 형식은 멀티쓰레드 형식의 프로그램에 최적화되어 자주 사용됨	
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
