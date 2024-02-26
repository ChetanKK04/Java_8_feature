package com.AllFunctional.Functions;

import java.util.function.Function;

public class FunctionTest {

	// Function = R apply(T obj);

	public static void main(String[] args) {

		Function<Integer, Boolean> fu = x -> x > 5;

		System.out.println(fu.apply(2));
	}

}
