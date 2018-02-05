package com.amarpandey.application;

import com.amarpandey.calcengine.CalculateHelper;
import com.amarpandey.calcengine.InvalidStatementException;

public class Main {

	public static void main(String[] args) {

		// useCalculateHelper();
		
		String[] statements = { 
				"addx 10.0 20.0" 
			};
		
		for (String statement : statements) {
			
		}
		
	}

	public static void useCalculateHelper() {

		String[] statements = { 
				"add 10.0", 
				"addx 10.0 aa", 
				"add aa 20.0",
				"addx 10.0 20.0", 
				"add 10.0 20.0", 
				"divide 100.0 50.0",
				"subtract 255.0 17.0", 
				"multiply 10.0 8.0" 
			};

		CalculateHelper helper = new CalculateHelper();

		for (String statement : statements) {

			try {

				helper.process(statement);
				System.out.println(helper);

			} catch (InvalidStatementException e) {

				System.out.println(e.getMessage());

				if (e.getCause() != null)
					System.out.println("Orignal Exception : "
							+ e.getCause().getMessage());
			}
		}
	}
}