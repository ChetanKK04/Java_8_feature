package com.Lambda_example;

interface Operation {

	int opt(int x, int y);

}

public class LambdaTEST {

	private static void result(int x, int y, Operation op) {

		System.out.println(op.opt(x, y));

	}

	public static void main(String[] args) {
		
		result(10, 4,(x,y)-> (x * y) );
		result(34, 22, (a,b)-> (a -b));
		result(55, 12, (p,q)-> (p+q));
		result(44, 22, (a,b)-> (a /b));
		result(77, 10, (p,q)-> (p%q));
		
		System.out.println("-----------------");
		
		Operation op = (x,y)-> (x * y);
		System.out.println(op.opt(7, 8));
		

	}

}
