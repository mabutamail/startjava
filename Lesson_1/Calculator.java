public class Calculator {
    public static void main(String[] args) {
        int firstNum = 7;
        int secondNum = 0;
        char operation = '^';
        double result = 0;
        if (operation == '+') {
            result = firstNum + secondNum;
        } else if (operation == '-') {
            result = firstNum - secondNum;
        } else if (operation == '*') {
            result = firstNum * secondNum;
        } else if (operation == '/') {
            if (secondNum == 0) {
                System.out.println("ошибка: деление на ноль!");
                return;
            } else {
                result = 1.0 * firstNum / secondNum;
            }
        } else if (operation == '%') {
            if (secondNum == 0) {
                System.out.println("ошибка: деление на ноль!");
                return;
            }
            result = firstNum % secondNum;
        } else if (operation == '^') {
            result = 1;
            for (int i = 0; i < secondNum; i++) {
                result *= firstNum;
            }
        }

        System.out.println("результат операции равен: " + firstNum + operation + secondNum + " = " + result);
    }
}