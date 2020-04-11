package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    private double result;
    private int firstNum;
    private String operation;
    private int secondNum;

    public Calculator() {
    }

    public Calculator(int firstNum, String operation, int secondNum) {
        this.firstNum = firstNum;
        this.operation = operation;
        this.secondNum = secondNum;
    }

    public Calculator(int firstNum, String operation) {
        this.firstNum = firstNum;
        this.operation = operation;
    }

    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }


    public double calculate() {

        switch (operation) {
            case "+":
                result = firstNum + secondNum;
                break;

            case "-":
                result = firstNum - secondNum;
                break;

            case "*":
                result = firstNum * secondNum;
                break;

            case "/":
                if (secondNum == 0) {
                    System.out.println("ошибка: деление на ноль!");
                    return 0;
                } else {
                    result = 1.0 * firstNum / secondNum;
                }
                break;

            case "%":
                if (secondNum == 0) {
                    System.out.println("ошибка: деление на ноль!");
                    return 0;
                } else {
                    result = 1.0 * firstNum % secondNum;
                }
                break;

            case "^":
                result = Math.pow (firstNum, secondNum);
//                result = 1;
//
//                for (int i = 0; i < secondNum; i++) {
//                    result *= firstNum;
//                }
                break;

            case "sqrt":
                result = Math.sqrt(firstNum);
                break;

            case "cbrt":
                result = Math.cbrt(firstNum);
                break;

            case "exp":
                result = Math.exp(firstNum);
                break;

            case "log":
                result = Math.log(firstNum);
                break;

            case "log10":
                result = Math.log10(firstNum);
                break;

            case "expm1":
                result = Math.expm1(firstNum);
                break;

            default:
                System.out.println("неопределенная математическая операция");
                break;
        }

        return result;
    }
}