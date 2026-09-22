package com.sunbeam;

import java.util.Scanner;

public class CountWords {

	public int cntWords(String str) {

		String str1 = str.trim();
		String[] str2 = str1.split(" ");
		return str2.length;

	}

	public static void main(String[] args) {
		CountWords cWords = new CountWords();
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		string = scanner.nextLine();
		System.out.println("Length of string " + string + " is " + cWords.cntWords(string));
	}

}
