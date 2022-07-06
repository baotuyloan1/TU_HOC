package me.java;

public class Minus extends Calculator {

	@Override
	public void cal(int a, int b) {
		int c = a - b;
		System.out.println("Minus: " + c);

	}

}
