package Java1_Ivan_Lesson5;

public class Bird extends Animal {

    private double lengthRunBird = 5;
    private double heightJumpBird = 0.2;


    public Bird(String name) {
        super(name);
    }

    //3.У каждого животного есть ограничения на действия
//(бег:  Птица 5 м.,;
//прыжок:  Птица 0.2 м. ;
//плавание: тица не умеет плавать,).

    @Override
    public String run(double length) {
        if (length <= lengthRunBird && length >= 0)
            return super.run(length);
        else return "Bird can't run this distance";
    }

    @Override
    public String swim(double length) {
        return "Bird can't swim ";
    }

    @Override
    public String jump(double height) {
        if (height <= heightJumpBird && height >= 0)
            return super.jump(height);
        else return "Bird can't jump this height ";
    }

    @Override
    public String test(int aaa) {
        return "I Was right";
    }
}