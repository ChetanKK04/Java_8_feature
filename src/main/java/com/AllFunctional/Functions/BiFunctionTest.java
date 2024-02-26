package com.AllFunctional.Functions;

import java.util.Objects;
import java.util.function.BiFunction;

public class BiFunctionTest {

	// BiFunction = R apply(T obj1, U obj2);

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Boolean> fu = (x, y) -> Objects.equals(x, y);
		System.out.println(fu.apply(3, 3));
		System.out.println(fu.apply(2, 3));
	}

}
