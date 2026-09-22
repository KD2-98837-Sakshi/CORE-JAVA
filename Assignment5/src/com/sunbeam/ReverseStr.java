package com.sunbeam;

import java.util.Scanner;

public class ReverseStr {

	public String rev(String str) {

		StringBuffer stringBuffer = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			stringBuffer.append(str.charAt(i));
		}
		return stringBuffer.toString();

	}

	public static void main(String[] args) {
		ReverseStr rStr = new ReverseStr();
		String string;
		System.out.println("Enter the String");
		Scanner scanner = new Scanner(System.in);
		string = scanner.nextLine();
		System.out.println(rStr.rev(string));
	}

}
