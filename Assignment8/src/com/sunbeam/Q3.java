package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "orange", "pink", "red", "blue", "purple", "green", "yellow", "maroon");
		System.out.println(list);
		System.out.print("Enter the element to enter at second position");
		Scanner sc = new Scanner(System.in);
		String element = sc.next();
		list.add(1, element);
		System.out.println(list);
		sc.close();
	}

}
