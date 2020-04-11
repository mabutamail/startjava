package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        int firstNum;
        String operation;
        int secondNum;

        System.out.print("Введите математическое выражение через пробел в виде \"2 ^ 10\": ");
        Scanner scan = new Scanner(System.in);
        String statement = scan.nextLine();
        scan.close();
        String[] arr = statement.split(" ");

        //валидация количества значений массива
        if (arr.length < 2 || arr.length > 3) {
            System.out.println("неопределенное выражение");
            return;
        }

        firstNum = Integer.parseInt(arr[0]);
        operation = arr[1];

        if (arr.length == 3) {
            secondNum = Integer.parseInt(arr[2]);
            Calculator calc = new Calculator();
            //используются сеттеры для выражений с 3 элементами
            calc.setFirstNum(firstNum);
            calc.setOperation(operation);
            calc.setSecondNum(secondNum);
            System.out.println("результат равен: " + firstNum + " " + operation + " " +
                    secondNum + " = " + calc.calculate());
        } else {
            //используется конструктор для выражений с 2 элементами
            Calculator calc = new Calculator(firstNum, operation);
            System.out.println("результат равен: " + firstNum + " " + operation + " = " +
                    calc.calculate());
        }
        
//        System.out.print("Введите первое число: ");
//        int firstNum = scan.nextInt();
//        calc.setFirstNum(firstNum);
//
//        System.out.print("Введите знак математической операции: ");
//        char operation = scan.next().charAt(0);
//        calc.setOperation(operation);
//
//        System.out.print("Введите второе число: ");
//        int secondNum = scan.nextInt();
//        calc.setSecondNum(secondNum);
    }
}