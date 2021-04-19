package Java1_Ivan_Lesson5;

public class Parrot extends Bird{
    public Parrot(String name){
        super(name);
    }

    @Override
    public String test(int aaa) {
        return " Наследник решает какой метод главный ";
    }
}
