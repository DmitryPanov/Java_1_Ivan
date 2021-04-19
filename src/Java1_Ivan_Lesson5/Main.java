package Java1_Ivan_Lesson5;

public class Main {
    public static void main(String[] args) {
/*

2.Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
В качестве параметра каждому методу передается величина, означающая или длину
препятствия (для бега и плавания), или высоту (для прыжков).

3.У каждого животного есть ограничения на действия
(бег: кот 200 м., собака 500 м., Лошадь 1500 м., Птица 5 м.,;
прыжок: кот 2 м., собака 0.5 м., Лошадь 3 м., Птица 0.2 м. ;
 плавание: кот и птица не умеет плавать, собака 10 м., лошадь 100 м.).

4.При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
 (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')

5.Добавить животным разброс в ограничениях. То есть у одной собаки ограничение
 на бег может быть 400 м., у другой 600 м.
* */

//1.Создать классы Собака, Лошадь, Птица и Кот с наследованием от класса Животное.
    Bird bird = new Bird("Chizik");
    Cat cat = new Cat("Barsik");
    Dog dog = new Dog("Bobik",150);
    Dog dog1 = new Dog("Sharik",155);
    Horse horse = new Horse("Gorbynok");
    Parrot parrot = new Parrot("Popka");
    System.out.println(cat.getClass());

    Animal [] animal = {bird,cat,dog,horse,parrot};
        for (int i = 0; i <animal.length ; i++) {
            System.out.println(animal[i].test(50));
        }



//        4.При попытке животного выполнить одно из этих действий, оно должно сообщить результат.
//        (Например, dog1.run(150); -> результат: 'Пёсик пробежал!')
//
//        System.out.println(cat.run(151.2));
//        System.out.println(cat.jump(3));
//        System.out.println(cat.swim(5));
//        System.out.println();

//        System.out.println(dog.run(151.2));
//        System.out.println(dog.jump(3));
//        System.out.println(dog.swim(5));
//        System.out.println();
//
//        System.out.println(dog1.run(156.2));
//        System.out.println(dog1.jump(3));
//        System.out.println(dog1.swim(5));
////        System.out.println();
//
//        System.out.println(horse.run(2151.2));
//        System.out.println(horse.jump(3));
//        System.out.println(horse.swim(5));
//        System.out.println();
//
//        System.out.println(bird.run(1.2));
//        System.out.println(bird.jump(0.13));
//        System.out.println(bird.swim(0.1));
//        System.out.println();

    }
}
