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

	private void work () {
		System.out.println("동작하다");
	}
	
	public void dddd () {
		System.out.println("동작하다");
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void printName() {
		System.out.println("My name is " + name);
	}
	
	public int takeOff() {
		System.out.println("엔진을 구동하다");
		System.out.println("엔진 구동에 실패하다");
		return 0;
	}
	public void setSpeed (int speed, int maxSpeed) {
		this.speed = speed;
		this.maxSpeed = maxSpeed;
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

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	

	
}
