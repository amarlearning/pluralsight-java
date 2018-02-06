package com.amarpandey.calcengine;

public class CalculateHelper {

  MathCommand command;
  double leftVal;
  double rightVal;
  double result;

  public void process(String statement) throws InvalidStatementException {

    String[] parts = statement.split(" ");

    if (parts.length != 3)
      throw new InvalidStatementException("Incorrect number of feilds", statement);

    String commandString = parts[0];

    try {
      leftVal = Double.parseDouble(parts[1]);
      rightVal = Double.parseDouble(parts[2]);
    } catch (NumberFormatException e) {
      throw new InvalidStatementException("Non-Numeric feild", statement, e);
    }

    setCommandFromString(commandString);

    if (this.command == null) throw new InvalidStatementException("Invalid command", statement);

    CalculateBase calculate = null;

    switch (command) {
      case Add:
        calculate = new Adder(leftVal, rightVal);
        break;

      case Subtract:
        calculate = new Subtracter(leftVal, rightVal);
        break;

      case Multiply:
        calculate = new Multiplier(leftVal, rightVal);
        break;

      case Divide:
        calculate = new Divider(leftVal, rightVal);
        break;
    }

    calculate.calculate();
    result = calculate.getResult();
  }

  private void setCommandFromString(String commandString) {

    if (commandString.equalsIgnoreCase(MathCommand.Add.toString())) {
      command = MathCommand.Add;
    } else if (commandString.equalsIgnoreCase(MathCommand.Subtract.toString())) {
      command = MathCommand.Subtract;
    } else if (commandString.equalsIgnoreCase(MathCommand.Multiply.toString())) {
      command = MathCommand.Multiply;
    } else if (commandString.equalsIgnoreCase(MathCommand.Divide.toString())) {
      command = MathCommand.Divide;
    }
  }

  @Override
  public String toString() {
    return "Result is : " + this.result;
  }
}
