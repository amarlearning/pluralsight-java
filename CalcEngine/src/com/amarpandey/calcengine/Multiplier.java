package com.amarpandey.calcengine;

public class Multiplier extends CalculateBase{

	public Multiplier() {
		
	}
	
	public Multiplier(double leftVal, double rightval) {
		super(leftVal, rightval);
	}

	@Override
	public void calculate() {
		double value = getLeftVal() * getRightVal();
		setResult(value);
		
	}
}
