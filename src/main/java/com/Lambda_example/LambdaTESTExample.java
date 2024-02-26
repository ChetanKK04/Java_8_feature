package com.Lambda_example;

interface Abc {

	void show();

	static void printS(int s) {

		System.out.println("I am static method of FunctionalInterface ");
	}

	default void printD(int y) {
		System.out.println("I am default method of FunctionalInterface ");
	}

}

public class LambdaTESTExample {

	public static void main(String[] args) {

		Abc c = () -> System.out.println("Hye lambda...");

		c.show();

	}

}
