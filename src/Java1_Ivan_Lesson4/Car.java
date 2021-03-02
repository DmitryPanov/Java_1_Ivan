package Java1_Ivan_Lesson4;

public class Car {
    private String model;
    private String color;

    Car() {
        this("Model Default");
    }

    Car(String model) {
        this("Color Default", model);
    }

    Car(String color, String model) {
        this.color = color;
        this.model = model;
        this.info();
    }

    public void run() {
        System.out.println("Car - Run...");
    }

    public void stop() {
        System.out.println("Car - Stop...");
    }

    public void info() {
        System.out.println("Car Model: " + model + ", Car Color: " + color);
    }
}