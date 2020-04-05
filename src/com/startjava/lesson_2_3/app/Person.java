package com.startjava.lesson_2_3.app;

public class Person {
    /**
     * Напишите в нем поля (атрибуты), описывающие характеристики человека:
     * пол, имя, рост, вес, возраст
     * Проинициализируйте их какими-то значениями
     * Создайте в классе методы, описывающие поведение (что он может делать) человека:
     * идти, сидеть, бежать, говорить, учить Java
     */

    char sex = 'm';
    String name = "Имя";
    float height = 10f;
    double mass = 22;
    int age = 33;

    void go() {
        System.out.println("иду");
    }

    void sit() {
        System.out.println("сижу");
    }

    void run() {
        System.out.println("бегу");
    }

    void speak() {
        System.out.println("говорю");
    }

    void learn() {
        System.out.println("учу Java");
    }


}