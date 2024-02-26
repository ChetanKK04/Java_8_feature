package com.AllFunctional.Consumers;

import java.util.function.Consumer;

public class ConsumerTest {

	// Consumer = void accept(T obj);

	public static void main(String[] args) {

		Consumer<String> con = x -> System.out.println(x.length());
		con.accept("chetan");

	}
}
