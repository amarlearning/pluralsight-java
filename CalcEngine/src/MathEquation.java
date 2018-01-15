
public class MathEquation {
	
	private double leftVal;
	private double rightVal;
	private char opCode;
	private double result;
	
	public MathEquation() {
		
	}
	
	public MathEquation(char opCode) {
		this.opCode = opCode;
	}
	
	public MathEquation(char opCode, double leftVal, double rightVal) {
		this(opCode);
		this.leftVal = leftVal;
		this.rightVal = rightVal;
	}

	public double getLeftVal() {
		return leftVal;
	}

	public void setLeftVal(double leftVal) {
		this.leftVal = leftVal;
	}

	public double getRightVal() {
		return rightVal;
	}

	public void setRightVal(double rightVal) {
		this.rightVal = rightVal;
	}

	public char getOpCode() {
		return opCode;
	}

	public void setOpCode(char opCode) {
		this.opCode = opCode;
	}

	public double getResult() {
		return result;
	}
	
	private double execute() {
		switch(opCode) {
			case 'a':
				this.result = this.leftVal + this.rightVal;
				break;
		
			case 's':
				this.result = this.leftVal - this.rightVal;
				break;
		
			case 'd':
				this.result = this.rightVal != 0 ? this.leftVal / this.rightVal : 0.0;
				break;
			
			case 'm':
				this.result = this.leftVal * this.rightVal;
				break;
			
			default:
				
		}
		
		return result;
	}
}
