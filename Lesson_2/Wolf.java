public class Wolf {
    /**
     * напишите в нем поля: пол, кличка, вес, возраст, окрас
     * напишите в нем методы: идти, сидеть, бежать, выть, охотиться
     */
    private char sex;
    private String name;
    private double mass;
    private int age;
    private String color;

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public void setAge(int age) {
        if (age > 8) {
            System.out.println("Некорректный возраст");
            //return;
        }
        this.age = age;

    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getMass() {
        return mass;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }


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