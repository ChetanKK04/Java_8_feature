package com.AllFunctional.Operators;

import java.util.function.UnaryOperator;

public class UnaryOperatorTest {

	public static void main(String[] args) {

			
		UnaryOperator<String> uo = (x)-> x.toUpperCase();
		System.out.println(uo.apply("Papu"));
	}

}
