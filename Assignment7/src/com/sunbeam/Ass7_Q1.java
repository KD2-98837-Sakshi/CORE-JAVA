package com.sunbeam;

import java.util.Scanner;

public class Ass7_Q1 {

	public static int calculateLength(String string) {
		return string.length();
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String string = scanner.nextLine();
		try {
			int length = calculateLength(string);
			if (length > 80) {
				throw new ExceptionLineTooLong();
			} else {
				System.out.println(string);
			}
		} catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}

	}

}
