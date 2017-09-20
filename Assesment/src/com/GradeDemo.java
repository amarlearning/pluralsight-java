package com;

public class GradeDemo {
	
	public static String findGrade(double percentage) {
		
		if (percentage >= 80) {
			return "A";
		} else if (percentage >= 60 && percentage < 80) {
			return "B";
		} else if (percentage >= 40 && percentage < 60) {
			return "C";
		} else if (percentage >= 30 && percentage < 40) {
			return "D";
		} else if (percentage >= 0 && percentage < 30) {
			return "E";
		} else {
			return "O";
		}
	}
	
	public static void main(String[] args) {
		
	}
	
}
