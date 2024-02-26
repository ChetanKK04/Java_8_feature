package com.AllFunctional.Predicates;

import java.util.function.Predicate;

public class PredicateTest {

	// Predicate = boolean test(T object)

	public static void main(String[] args) {

		Predicate<Integer> pr = x -> x > 10;
		System.out.println(pr.test(16));

	}

}
