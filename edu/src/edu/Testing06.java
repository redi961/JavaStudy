package edu;

import com.ruby.java.test1.*;


public class Testing06 {

	
	public static void main(String[] args) {
		
		Armor armor = new Armor();
		System.out.println("name : " + armor.getName());
		
		Armor ar1 = new Armor("홍1동");
		System.out.println("name : " + ar1.getName());
		
		Armor ar2 = new Armor("홍2동", 100, 100,"Red", true, 30, 100);
		System.out.println("name : " + ar2.getName());
		System.out.println("Color : " + ar2.getColor());
		System.out.println("Speed : " + ar2.getSpeed() + "\t MaxSpeed : " + ar2.getMaxSpeed());
		
		// armor.dddd();
//		armor.setName("ABCD");
//		String n = armor.getName();
//		System.out.println("Name is : " + n);
//		
//		//height
//		armor.setHeight(190);
//		int height = armor.getHeight();
//		System.out.println("크기 : " + height);
//		
//		
//		//weight
//		armor.setWeight(120);
//		int weight = armor.getWeight();
//		System.out.println("무게 : " + weight);
//		
//		armor.setSpeed(30, 100);
//		int speed = armor.getSpeed();
//		int maxSpeed = armor.getMaxSpeed();
//		System.out.println("Speed : " + speed + "\t Max Speed : " + maxSpeed );
//		
		//armor.printName();
		//armor.takeOff();

		

		
	}

}

