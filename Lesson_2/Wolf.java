package Lesson2;

public class Wolf {
	/**
		напишите в нем поля: пол, кличка, вес, возраст, окрас
		напишите в нем методы: идти, сидеть, бежать, выть, охотиться
	*/
	public char sex;
	public String name;
	public double mass;
	public int age;
	public String color;
	

	public void go() {
		System.out.println("иду");
	}
	public void sit() {
		System.out.println("сижу");
	}
	public void run() {
		System.out.println("бегу");
	}
	public void scream() {
		System.out.println("вою");
	}
	public void hunt() {
		System.out.println("охочусь");
	}
}