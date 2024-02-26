package com.AllFunctional.Suppliers;

import java.util.function.Supplier;

public class SupplierTest {

	// Supplier = T get();

	public static void main(String[] args) {

		Supplier<String> su = () -> "Not found ";
		System.out.println(su.get());

	}

}
