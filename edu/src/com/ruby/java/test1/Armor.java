package com.ruby.java.test1;

import com.ruby.java.test2.*;
import java.util.List;
import java.io.*;



public class Armor {
	private String name;
	private int height;
	private int weight;
	private String color;
	private boolean isFly;
	private int speed;
	private int maxSpeed;
	
	public Armor () {
		name = "John";
	}
	
	public Armor(String name) {
		this.name = name;
	}
	
	
	
// 소스항목의 Generate Constructor 를 이용하여 생성자를 한번에 다수 선언함 / 생성자를 통하여 변수설정 후 Set 진행
// 메소드 오버로드로 인하여 해당 생성자 이용시 name값은 John이 아닌 생성자의 이름이 String 에 저장된다.
	public Armor(String name, int height, int weight, String color, boolean isFly, int speed, int maxSpeed) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.color = color;
		this.isFly = isFly;
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}

//	private void work () {
//	System.out.println("동작하다");
//	}
	
	public void dddd () {
		System.out.println("동작하다");
	}
	
	public void printName() {
		System.out.println("My name is " + name);
	}
	
	public int takeOff() {
		System.out.println("엔진을 구동하다");
		System.out.println("엔진 구동에 실패하다");
		return 0;
	}
	
//	우클릭 후 소스사용으로 Get/Set 빠르게 생성 가능
// 	set 항목 예문
//	public void setColor(String color) {
//		this.color = color;
//	}
//	
	
	
//	 get문으로 return값으로 반환
	public String getName() {
		return name;
	}


	public int getSpeed() {
		return speed;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getHeight() {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getColor() {
		return color;
	}
}
