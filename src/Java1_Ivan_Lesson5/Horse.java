package Java1_Ivan_Lesson5;

public class Horse extends Animal {
    private double lengthRunHorse = 1500;
    private double heightJumpHorse = 3;
    private double heightSwimHorse = 100;


    public Horse(String name){
        super(name);
    }

    //3.У каждого животного есть ограничения на действия
//(бег: Лошадь 1500 м. прыжок:  Лошадь 3 м.,плавание: лошадь 100 м.).
    @Override
    public String run(double length) {
        if (length <= lengthRunHorse && length >= 0)
            return super.run(length);
        else return "Horse can't run this distance";
    }

    @Override
    public String swim(double length) {
        if (length <= heightSwimHorse && length >= 0)
            return super.swim(length);
        else return "Horse can't swim this distance";
    }

    @Override
    public String jump(double height) {
        if (height <= heightJumpHorse && height >= 0)
            return super.jump(height);
        else return "Horse can't jump this height ";
    }

}
