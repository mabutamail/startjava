public class CalculatorTest {
    public static void main(String[] args) {
        int firstNum = 7;
        int secondNum = 5;
        char operation = '+';
        double result = 0;


        switch (operation) {
            case 1:
                operation = '+';
                result = firstNum + secondNum;
                break;

            case 2:
                operation = '-';
                result = firstNum - secondNum;
                break;

            case 3:
                operation = '*';
                result = firstNum * secondNum;
                break;

            case 4:
                operation = '/';
                if (secondNum == 0) {
                    System.out.println("ошибка: деление на ноль!");
                    return;
                } else {
                    result = 1.0 * firstNum / secondNum;
                }
                break;

            case 5:
                operation = '%';
                result = firstNum % secondNum;
                break;

            case 6:
                operation = '^';
                result = 1;
                for (int i = 0; i < secondNum; i++) {
                    result *= firstNum;
                }
                break;
            default:
                System.out.println("неопределенный знак математической операции");
                break;
        }

//        if (operation == '+') {
//            result = firstNum + secondNum;
//        } else if (operation == '-') {
//            result = firstNum - secondNum;
//        } else if (operation == '*') {
//            result = firstNum * secondNum;
//        } else if (operation == '/') {
//            if (secondNum == 0) {
//                System.out.println("ошибка: деление на ноль!");
//                return;
//            } else {
//                result = 1.0 * firstNum / secondNum;
//            }
//        } else if (operation == '%') {
//            if (secondNum == 0) {
//                System.out.println("ошибка: деление на ноль!");
//                return;
//            }
//            result = firstNum % secondNum;
//        } else if (operation == '^') {
//            result = 1;
//            for (int i = 0; i < secondNum; i++) {
//                result *= firstNum;
//            }
//        }

        System.out.println("результат операции равен: " + firstNum + operation + secondNum + " = " + result);
    }
}