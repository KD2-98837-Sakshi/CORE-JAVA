package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q2 {

	public static void main(String[] args) {
		List<String> color = new ArrayList<>();
		Collections.addAll(color, "orange", "pink", "red", "blue", "purple", "green", "yellow", "maroon");
		Collections.sort(color);
		System.out.println("Asc sort");
		System.out.println(color);
		System.out.println("Desc sort");
		Collections.sort(color, (x, y) -> -x.compareTo(y));
		System.out.println(color);
	}

}
