package com;

public class Calculator {
	
	public static int add(int A, int B) {
		return (A + B);
	}
	
	public static int subtract(int A, int B) {
		return Math.abs(A - B);
	}
	
	public static int multiply(int A, int B) {
		return (A * B);
	}
	
	public static int divide(int A, int B) {
		if(B == 0)
			return 0;
		else
			return (A / B);
	}
}
