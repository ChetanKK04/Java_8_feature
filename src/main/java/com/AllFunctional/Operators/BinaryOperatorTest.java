package com.AllFunctional.Operators;

import java.util.function.BinaryOperator;

public class BinaryOperatorTest {

	public static void main(String[] args) {

		BinaryOperator<String> bo = (x,y) -> (x+y);
		
		System.out.println(bo.apply("kaju", "Badam"));
		
	}

}
