package Java1_Ivan_Lesson4;

import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    Main(){
        JButton button = new JButton("Start");
        JPanel jPanel = new JPanel(new GridLayout(1,2));
        jPanel.add(button);
        add(jPanel);
    }

    public static void main(String[] args) {

//        new Main();
        System.out.printf("Test what i want value: %.0f | What im write :%d" , 5.123456789,10);


        }
//        System.out.println(up(5));
//        Car car = new Car();
////        Car car1 = new Car("Ford");
//        Car car2 = new Car("RED", "Ford");


//        Cat cat = new Cat();
//        Cat cat1 = new Cat();
//        Cat cat2 = new Cat("Myrka","Red");
//        Cat cat3 = new Cat("Vasil","RedAndWhite",6);
//
//        cat.name = "Barsik";
//        cat1.name = "Myrzik";
//
//        cat.age();
//        cat1.age();
//        cat2.age();
//        cat3.age();

}
