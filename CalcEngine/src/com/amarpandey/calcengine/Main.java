package com.amarpandey.calcengine;

public class Main {

	public static void main(String[] args) {
		
		String[] statements = {
				"add 10.0 20.0",
				"divide 100.0 50.0",
				"subtract 255.0 17.0",
				"multiply 10.0 8.0"
		};
		
		
		CalculateHelper helper = new CalculateHelper();
		
		for(String statement: statements) {
			helper.process(statement);
			System.out.println(helper);
		}
		
	}

}
