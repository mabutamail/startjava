import java.util.Scanner;

public class GuessNumber {
    public static Scanner scan = new Scanner(System.in);
    public static Player playerOne;
    public static Player playerTwo;


    public static void game() {
        int secretNumber = (int) (Math.random() * 101);
        System.out.print("Введите имя первого игрока: ");
        playerOne = new Player(scan.next());
        System.out.print("Введите имя второго игрока: ");
        playerTwo = new Player(scan.next());

        while (true) {
            System.out.println(secretNumber);
            System.out.println("Угадайте число от 1 до 100 ");
            playerOne.setNumber(scan.nextInt());
            guessNumber(playerOne.getNumber());

            System.out.println("Угадайте число от 1 до 100 ");
            playerTwo.setNumber(scan.nextInt());
            guessNumber(playerTwo.getNumber());
        }
    }


    private static void guessNumber(int secretNumber) {
        int userNumber = scan.nextInt();
        if (userNumber > secretNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
        } else if (userNumber < secretNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали! Это число " + userNumber);
            exit();
            return;
        }
    }

    private static void exit() {
        while (true) {
            System.out.println("Хотите продолжить? [да/нет]: ");
            String answer = scan.next();
            if (answer.equals("нет")) {
                System.out.println("Выход из игры");
                return;
            } else if (answer.equals("да")) {
                System.out.println("Новая игра");
                game();
                return;
            }
        }
    }
}