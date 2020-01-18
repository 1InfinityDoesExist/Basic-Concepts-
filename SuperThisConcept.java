package com.springboot.issues1;

public class SuperThisConcept {
	public static void main(String[] args) {

		SubClass object = new SubClass();
	}

}

class SuperConcept {

	public int x;
	public int y;
	public int z;
	public String name;

	public SuperConcept() { // TODO Auto-generated constructor stub this.x = 100;
		this.y = 200;
		this.x = 250;
		this.z = 600;
		this.name = "You Should Have Trusted Me To Finish The Job:- James Bond";
		System.out.println("x value is -" + x);
		System.out.println("y value is -" + y);
		System.out.println("z value is :- " + z);
	}

}

class SubClass extends SuperConcept {
	private int x;
	private int y;
	private int z;

	public SubClass() {
		y = 142;
		super.z = 500;
		System.out.println("***************************************************");
		System.out.println("Simple X valus is:- " + x);
		System.out.println("this.x value is :-" + this.x);
		System.out.println("super.x value is :-" + super.x);
		System.out.println("**************************************************");
		System.out.println("super.y value is:- " + super.y);
		System.out.println("Simple y value is:- " + y);
		System.out.println(name);
		System.out.println("z value is :- " + z);
		System.out.println("super.z value is :- " + super.z );
		System.out.println("this.z value is :-" + this.z);

	}

}
