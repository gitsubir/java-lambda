package com.java.lambda.app;

import java.util.Arrays;
import java.util.List;

public class StringApp {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("John", "Harry", "Chris");
		System.out.println("Before sort: " + names);
		names.sort((name1, name2) -> name1.compareTo(name2));
		System.out.println("After sort: " + names);

	}

}
