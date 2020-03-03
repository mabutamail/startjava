import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        int firstNum = 7;
        int secondNum = 4;
        char operation = '^';
        double result = 0;


        System.out.print("Введите первое число: ");
        Scanner scan = new Scanner(System.in);
        firstNum = scan.nextInt();
        System.out.print("Введите знак математической операции: ");
        operation = (char) scan.next().charAt(0);
        System.out.print("Введите второе число: ");
        secondNum = scan.nextInt();


        switch (operation) {
            case '+':
                result = firstNum + secondNum;
                break;

            case '-':
                result = firstNum - secondNum;
                break;

            case '*':
                result = firstNum * secondNum;
                break;

            case '/':
                if (secondNum == 0) {
                    System.out.println("ошибка: деление на ноль!");
                    return;
                } else {
                    result = 1.0 * firstNum / secondNum;
                }
                break;

            case '%':
                if (secondNum == 0) {
                    System.out.println("ошибка: деление на ноль!");
                    return;
                } else {
                    result = 1.0 * firstNum % secondNum;
                }
                break;

            case '^':
                result = 1;
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                break;
            default:
                System.out.println("неопределенный знак математической операции");
                break;
        }


        System.out.println("результат операции равен: " + firstNum + operation + secondNum + " = " + result);
    }
}