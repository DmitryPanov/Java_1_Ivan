package Java1_Ivan_Lesson5;

public class Cat extends Animal {

    private double lengthRunCat = 200;
    private double heightJumpCat = 2;

    public Cat(String name) {
        super(name);
    }
//
//3.У каждого животного есть ограничения на действия
//(бег: кот 200 м., прыжок: кот 2 м.,плавание: кот не умеет плавать).

    @Override
    public String run(double length) {
        if (length <= lengthRunCat && length >= 0)
            return super.run(length);
        else return "Cat can't run this distance";
    }

    @Override
    public String swim(double length) {
        return "Cat can't swim ";
    }

    @Override
    public String jump(double height) {
        if (height <= heightJumpCat && height >= 0)
            return super.jump(height);
        else return "Cat can't jump this height ";
    }
}
