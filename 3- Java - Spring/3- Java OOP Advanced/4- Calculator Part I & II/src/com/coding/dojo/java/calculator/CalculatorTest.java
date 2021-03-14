package com.coding.dojo.java.calculator;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator calcMultiply = new Calculator();
        Calculator calcAdd = new Calculator();
        Calculator calcDivide = new  Calculator();
        Calculator calcSubtract = new Calculator();


        //Multiplication test case:
        calcMultiply.setFirstOperand("5");
        calcMultiply.setSecondOperand("13");
        calcMultiply.setOperation("*");
        calcMultiply.performOperation();
        calcMultiply.getResults();
        System.out.println();

        //Addition test case:
        calcAdd.setFirstOperand("2.2");
        calcAdd.setSecondOperand("2.9");
        calcAdd.setOperation("+");
        calcAdd.performOperation();
        calcAdd.getResults();
        System.out.println();

        //Division test case:
        calcDivide.setFirstOperand("25.2");
        calcDivide.setSecondOperand("5");
        calcDivide.setOperation("/");
        calcDivide.performOperation();
        calcDivide.getResults();
        System.out.println();

        //Subtraction test case:
        calcSubtract.setFirstOperand("-9.5");
        calcSubtract.setSecondOperand("12");
        calcSubtract.setOperation("-");
        calcSubtract.performOperation();
        calcSubtract.getResults();
        System.out.println();

        //Negative test case:
        calcSubtract.setFirstOperand("9");
        calcSubtract.setSecondOperand("2");
        calcSubtract.setOperation("+-");
        calcSubtract.performOperation();
        System.out.println();


    }
}
