package com.AllFunctional.Consumers;

import java.util.function.BiConsumer;

public class BiConsumerTest {

	// BiConsumer = void accept(T t, U u);

	public static void main(String[] args) {

		BiConsumer<String, String> con = (x, y) -> System.out.println(x + ":" + y);
		con.accept("chetan", "Kawadkar");

	}
}
