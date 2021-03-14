package com.coding.dojo.java.calculator;

public class Calculator implements CalculatorOperands {
    private double first;
    private double second;
    private String operand;
    private double result;
    private static String[] math = {"+", "-", "*", "/"};


    //constructor

    public Calculator() {}

    //Getters and setters:
    public double getFirstOperand() {
        return this.first;
    }

    public void setFirstOperand(String operand) {
        this.first = Double.parseDouble(operand);
    }

    public double getSecondOperand() {
        return this.second;
    }
    public void setSecondOperand(String operand) {
        this.second = Double.parseDouble(operand);
    }

    public String getOperation() {
        return this.operand;
    }


    public void setOperation(String operation) {
        if (operation.length() > 1) {
            System.out.println("Please use simple math (one operation at a time), I'm not that smart.");
            return;
        }
        else {
            for (int i = 0; i < 4; i++) {
                if (math[i] == operation) {
                    this.operand = operation;
                }
            }
        }
    }



    // Overriding what's in the CalculatorOperands and performs the operation
    //but does not show results

    @Override
    public void performOperation() {
        if(this.operand == "+") {
            this.result = (this.first + this.second);
        }
        else if(this.operand == "-") {
            this.result = (this.first - this.second);
        }
        else if(this.operand == "*") {
            this.result = (this.first * this.second);
        }
        else if (this.operand == "/") {
            this.result = (this.first / this.second);
        }
    }

    // Overrides and returns the result
    @Override
    public double getResults() {
        System.out.println("Calculation: " + first + " " + operand + " " + second + " = " + result);
        return result;
    }
}
