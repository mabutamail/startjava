package Lesson2;

public class WolfTest {
	public static void main(String[] args) {
		Wolf wolf1 = new Wolf();

		wolf1.sex = 'm';
		wolf1.name = "ИмяВолка";
		wolf1.mass = 11;
		wolf1.age = 22;
		wolf1.color = "красного цвета";

		System.out.println(wolf1.sex + " " + wolf1.name + " " + wolf1.mass + " " 
			+ wolf1.age + " " + wolf1.color);

		wolf1.go();
		wolf1.sit();
		wolf1.run();
		wolf1.scream();
		wolf1.hunt();
	}

}