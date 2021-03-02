package Java1_Ivan_Lesson5;

public class Dog extends Animal {
    private double lengthRunDog;
    private double heightJumpDog = 0.5;
    private double heightSwimDog = 10;
    private String nameDog;

    public Dog(String name, double lengthRunDog) {
        super(name);
        this.lengthRunDog = lengthRunDog;
        this.nameDog = name;
    }

    //3.У каждого животного есть ограничения на действия
//(бег: собака 500 м.прыжок:  собака 0.5 м.,плавание:собака 10 м.).
    @Override
    public String run(double length) {
        if (length <= lengthRunDog && length >= 0)
            return super.run(length);
        else return nameDog + " can't run this distance";
    }

    @Override
    public String swim(double length) {
        if (length <= heightSwimDog && length >= 0)
            return super.swim(length);
        else return nameDog + " can't swim this distance";
    }

    @Override
    public String jump(double height) {
        if (height <= heightJumpDog && height >= 0)
            return super.jump(height);
        else return nameDog + " can't jump this height ";
    }

}
