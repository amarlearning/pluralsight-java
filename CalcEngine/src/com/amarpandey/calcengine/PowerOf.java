package com.amarpandey.calcengine;

public class PowerOf implements MathProcessing {

  @Override
  public double doCalculation(double leftVal, double rightVal) {
    return Math.pow(leftVal, rightVal);
  }

  @Override
  public char getChar() {
    return '^';
  }

  @Override
  public String getKeyword() {
    return "power";
  }
}
