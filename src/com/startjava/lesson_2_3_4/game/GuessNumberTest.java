package com.startjava.lesson_2_3_4.game;


public class GuessNumberTest {
    public static void main(String[] args) {
        GuessNumber.game();

        //TODO: где в этом возникает необходимость?
//        Для считывания части массива используйте метод Arrays.copyOf
//        int [] numbersCopy = Arrays.copyOf(playerOne.getNumbers(), 2);

        //TODO: обнуляются автоматом при вызове метода game
//        Для обнуления массивов игроков, при повторном запуске игры,
//        используйте метод Arrays.fill(). При этом обнуляйте только те ячейки,
//        где хранятся, названные игроками числа
//        Arrays.fill(playerOne.getNumbers(), 3, 7,  999);
//        Arrays.fill(playerOne.getNumbers(), 0);
    }

}