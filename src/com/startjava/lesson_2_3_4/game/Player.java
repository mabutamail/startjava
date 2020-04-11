package com.startjava.lesson_2_3_4.game;


import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] numbers = new int[10];
    int count = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.numbers[count] = number;
        this.number = number;
        count++;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", numbers=" + Arrays.toString(numbers) +
                ", count=" + count +
                '}';
    }
}