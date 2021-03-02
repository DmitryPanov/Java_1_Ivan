package Java1_Ivan_Lesson4;

public class Cat {
    String name;
    String color;
    int age;

    Cat() {
        age = 3;
    }

    Cat(String name, String color) {
        this();
        this.name = name;
        this.color = color;
    }
    Cat(String name, String color,int age) {
        this.age = age;
        this.name = name;
        this.color = color;
    }


    void age() {
        System.out.println(name + " " + age);
    }


}
