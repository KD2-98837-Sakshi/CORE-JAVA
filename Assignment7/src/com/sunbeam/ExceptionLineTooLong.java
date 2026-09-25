package com.sunbeam;

public class ExceptionLineTooLong extends Exception {
	@Override
	public String getMessage() {
		return "The strings is too long";
	}
}
