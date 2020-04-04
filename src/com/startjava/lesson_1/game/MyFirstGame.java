import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyFirstGame {
    public static void main(String[] args) throws IOException {
        int secretNumber = 34; //целое от 1 до 100
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Integer userNumber = Integer.parseInt(br.readLine());
        //int userNumber = 34;

        while (true) {
            System.out.println("Угадайте число от 1 до 100 "); //CHCP 65001 в консоли powershell
            int userNumber = Integer.parseInt(br.readLine());
            if (userNumber > secretNumber) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
            } else if (userNumber < secretNumber) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Вы угадали! Это число " + userNumber);
                return;
            }
        }
    }
}