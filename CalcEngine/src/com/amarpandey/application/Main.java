package com.amarpandey.application;

import com.amarpandey.calcengine.Adder;
import com.amarpandey.calcengine.CalculateHelper;
import com.amarpandey.calcengine.DynamicHelper;
import com.amarpandey.calcengine.InvalidStatementException;
import com.amarpandey.calcengine.MathProcessing;
import com.amarpandey.calcengine.PowerOf;

public class Main {

  public static void main(String[] args) {

    // useCalculateHelper();

    String[] statements = {"add 10.0 21.0", "power 5.0 2.0"};

    DynamicHelper helper = new DynamicHelper(new MathProcessing[] {new Adder(), new PowerOf()});

    for (String statement : statements) {
      System.out.println(helper.process(statement));
    }
  }

  public static void useCalculateHelper() {

    String[] statements = {
      "add 10.0 20.0", "divide 100.0 50.0", "subtract 255.0 17.0", "multiply 10.0 8.0"
    };

    CalculateHelper helper = new CalculateHelper();

    for (String statement : statements) {

      try {

        helper.process(statement);
        System.out.println(helper);

      } catch (InvalidStatementException e) {

        System.out.println(e.getMessage());

        if (e.getCause() != null)
          System.out.println("Orignal Exception : " + e.getCause().getMessage());
      }
    }
  }
}
