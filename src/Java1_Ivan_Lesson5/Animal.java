package Java1_Ivan_Lesson5;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }
//2.Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие.
//    В качестве параметра каждому методу передается величина, означающая или длину
//    препятствия (для бега и плавания), или высоту (для прыжков).

    public String run (double length){
        return name + " run " + length;
    }
    public String swim (double length){
        return name + " swim " + length;
    }
    public String jump (double height){
        return name + " jump " + height;
    }
    public String test(int aaa){
        return aaa + " test ";
    }

}
