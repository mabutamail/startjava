package com.startjava.lesson_2_3_4.robot;

public class JaegerTest {
    public static void main(String[] arr) {
        Jaeger bracerPhoenix = new Jaeger();
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", 79.25f, 1.98f, 7, 8, 6);

        bracerPhoenix.setModelName("Bracer Phoenix");
        bracerPhoenix.setMark("Mark-5");
        bracerPhoenix.setOrigin("USA");
        bracerPhoenix.setHeight(70.7f);
        bracerPhoenix.setWeight(2.1f);
        bracerPhoenix.setSpeed(3);
        bracerPhoenix.setStrength(8);
        bracerPhoenix.setArmor(9);

        if (bracerPhoenix.drift()) System.out.println("дрифт 89%");
        bracerPhoenix.move();
        System.out.println(bracerPhoenix.getModelName() + ": " + bracerPhoenix.scanKaiju());
        bracerPhoenix.useVortexCannon();

        if (gipsyDanger.drift()) System.out.println("дрифт 55%");
        gipsyDanger.move();
        System.out.println(gipsyDanger.getModelName() + ": " + gipsyDanger.scanKaiju());
        gipsyDanger.useVortexCannon();

        System.out.println(bracerPhoenix);
        System.out.println(gipsyDanger);
    }
}