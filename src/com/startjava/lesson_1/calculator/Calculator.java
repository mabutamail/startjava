public class Calculator {

    private double result;
    private int firstNum ;
    private int secondNum;
    private char operation;


    public void setFirstNum(int firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNum(int secondNum) {
        this.secondNum = secondNum;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }


    public double calculate() {

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
                    return 0;
                } else {
                    result = 1.0 * firstNum / secondNum;
                }
                break;

            case '%':
                if (secondNum == 0) {
                    System.out.println("ошибка: деление на ноль!");
                    return 0;
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

        return result;
    }
}