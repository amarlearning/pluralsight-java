package com.amarpandey.calcengine;

public class Adder extends CalculateBase implements MathProcessing {

	public Adder(){
		
	}
	
	public Adder(double leftVal, double rightVal) {
		super(leftVal, rightVal);
	}
	
	@Override
	public void calculate() {
		double value = getLeftVal() + getRightVal();
		setResult(value);
	}

	@Override
	public double doCalculation(double leftVal, double rightVal) {
		setLeftVal(leftVal);
		setRightVal(rightVal);
		
		calculate();
		
		return getResult();
	}

	@Override
	public char getChar() {
		return '+';
	}

	@Override
	public String getKeyword() {
		return "add";
	}

}
