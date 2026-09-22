package com.sunbeam;

import java.util.Scanner;

public class PalindromeStr {

	public Boolean isPalindrome(String str) {

		StringBuffer stringBuffer = new StringBuffer();
		for (int i = str.length() - 1; i >= 0; i--) {
			stringBuffer.append(str.charAt(i));
		}
		String str1 = stringBuffer.toString();
		if (str1.equals(str)) {
			return true;
		}
		return false;

	}

	public static void main(String[] args) {
		PalindromeStr pStr = new PalindromeStr();
		String string;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		string = scanner.nextLine();
		if (pStr.isPalindrome(string)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
	}

}
