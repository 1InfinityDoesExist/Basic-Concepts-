package com.springboot.issues1;

public class InitializerBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InitializerDemo demo;
		demo = new InitializerDemo();
		demo = new InitializerDemo(5, 10);

	}

}

class InitializerDemo {

	{
		System.out.println("Happy BirthDay To You");
	}

	public InitializerDemo() {
		System.out.println("***********I am inside InitaizerDemo Default Constructor***************");
	}

	public InitializerDemo(int x, int y) {
		x = 10;
		y = 20;
		System.out.println("X :- " + x);
		System.out.println("Y :- " + y);

	}
}
