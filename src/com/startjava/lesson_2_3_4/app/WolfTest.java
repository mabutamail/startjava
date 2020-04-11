package com.startjava.lesson_2_3_4.app;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();

		wolf1.setSex('m');
		wolf1.setName("ИмяВолка");
		wolf1.setMass(11);
		wolf1.setAge(4);
		wolf1.setColor("красного цвета");

		System.out.println(wolf1.getSex() + " " + wolf1.getName() + " " +
				wolf1.getMass() + " " + wolf1.getAge() + " " + wolf1.getColor());

		wolf1.go();
		wolf1.sit();
		wolf1.run();
		wolf1.scream();
		wolf1.hunt();
	}

}