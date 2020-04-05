package com.startjava.lesson_1.unicode;

import java.nio.charset.Charset;

public class Unicode {
    public static void main(String[] args) {
        System.out.println("текущая кодировка " + Charset.defaultCharset());
        int lineSize = 0;
        
        for (int i = 33; i <= 126; i++) {
            System.out.print((char) i);
            lineSize++;
            if (lineSize == 80) {
                System.out.println();
                lineSize = 0;
            }
        }
        System.out.println("\n-------------------------------------------------");
    }
}