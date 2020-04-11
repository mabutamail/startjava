package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;


public class GuessNumber {
    public static void game() {
        Scanner scan = new Scanner(System.in);
        Player playerOne;
        Player playerTwo;

        int secretNumber = (int) (Math.random() * 101);
//        System.out.println(secretNumber);     //вывод секретного номера для тестов

        System.out.print("\nВведите первого и второго игрока: \n");
        playerOne = new Player(scan.nextLine());
        playerTwo = new Player(scan.nextLine());
        System.out.println("У вас 10 попыток");

        for (int i = 0; i < 10; i++) {
            System.out.print("ход игрока " + playerOne.getName() + " попытка № " + (i + 1) + " ");
            playerOne.setNumber(scan.nextInt());
            boolean playerOneWin = compare(playerOne, secretNumber, i);

            System.out.print("ход игрока " + playerTwo.getName() + " попытка № " + (i + 1) + " ");
            playerTwo.setNumber(scan.nextInt());
            boolean playerTwoWin = compare(playerTwo, secretNumber, i);

            if (i == 9) {
                System.out.println("У игрока " + playerOne.getName() + " закончились попытки");
                System.out.println("У игрока " + playerTwo.getName() + " закончились попытки");
            }

            if (playerOneWin || playerTwoWin) {
                break;
            }
        }

        printFinal(playerOne);
        printFinal(playerTwo);
        exit();
    }


    protected static Boolean compare(Player player, int secretNumber, int i) {
        if (player.getNumber() > secretNumber) {
            System.out.println("Введенное вами число больше того, что загадал компьютер");
            return false;
        } else if (player.getNumber() < secretNumber) {
            System.out.println("Введенное вами число меньше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Игрок " + player.getName() + " угадал число " +
                    player.getNumber() + " с " + (i + 1) + " попытки");
            return true;
        }
    }


    //отобразите, в две строки через пробел, все названные игроками числа
    protected static void printFinal(Player player) {
        System.out.print("\nвсе названные игроком " + player.getName() + " числа: \n");
        for (int i = 0; i < player.getNumbers().length; i++) {
            if (player.getNumbers()[i] == 0) {
                break;
            }
            System.out.print(player.getNumbers()[i] + " ");
            if (i == 4) System.out.println();
        }
    }


    protected static void exit() {
        Scanner scan = new Scanner(System.in);
        String answer;
        while (true) {
            System.out.println("\nХотите продолжить? [да/нет]: ");
            answer = scan.next();
            if (answer.equals("да")) {
                System.out.println("Новая игра");
                game();
                return;
            } else if (answer.equals("нет")) {
                System.out.println("Выход из игры");
                return;
            }
        }
    }

}