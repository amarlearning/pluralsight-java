package com.amarpandey.calcengine;

public class DynamicHelper {

	private MathProcessing[] handlers;
	
	public DynamicHelper(MathProcessing[] handlers) {
		this.handlers = handlers;
	}
	
	public String process(String statement) {
		// add 1.0 2.0
		// 1.0 + 2.0 = 3.0		
		
		String[] splitStatement = statement.split(MathProcessing.SEPERATOR);
		String keyword = splitStatement[0];
		
		MathProcessing theHandler = null;
		
		for(MathProcessing handler :  this.handlers) {
			if(keyword.equalsIgnoreCase(handler.getKeyword())) {
				theHandler = handler;
				break;
			}
		}
		
		double leftVal = Double.parseDouble(splitStatement[1]);
		double rightVal = Double.parseDouble(splitStatement[2]);
		
		double result = theHandler.doCalculation(leftVal, rightVal);
		
		StringBuilder sb = new StringBuilder();
		sb.append(leftVal);
		sb.append(" ");
		sb.append(theHandler.getChar());
		sb.append(" ");
		sb.append(rightVal);
		sb.append(" = ");
		sb.append(result);
		
		return sb.toString();
	}
	
}
