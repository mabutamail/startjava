import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calc = new Calculator();


        System.out.print("Введите первое число: ");
        int firstNum = scan.nextInt();
        calc.setFirstNum(firstNum);

        System.out.print("Введите знак математической операции: ");
        char operation = scan.next().charAt(0);
        calc.setOperation(operation);

        System.out.print("Введите второе число: ");
        int secondNum = scan.nextInt();
        calc.setSecondNum(secondNum);

        System.out.println("результат операции равен: " + firstNum + operation + secondNum + " = " + calc.calculate());
    }
}