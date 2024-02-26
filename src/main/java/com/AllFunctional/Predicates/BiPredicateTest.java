package com.AllFunctional.Predicates;

import java.util.function.BiPredicate;

public class BiPredicateTest {

	// BiPredicate = boolean test(T ob1, U ob2)

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> bpr = (x, y) -> x > y;
		System.out.println(bpr.test(7, 9));
	}

}
