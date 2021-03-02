package Java1_Ivan_Lesson4.HW;

public class Employee {
    /*
     * 8.*** Продумать конструктор таким образом, чтобы при создании каждому сотруднику
     *   присваивался личный уникальный идентификационный порядковый номер
     */
    //1.Создать класс "Сотрудник" с полями: Фамилия, зарплата, возраст, должность;
    private String surname;
    private int salary;
    private int age;
    private String office;
    private static int id = 1;
    public int uid;

    public Employee() {
//        this("6", 6, 6, "6");
    }

    public Employee(String surname, int salary, int age, String office) {
        this.surname = surname;
        this.salary = salary;
        this.age = age;
        this.office = office;
        this.uid = id++;
    }

    //3.Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
    public String getSurname() {
        return surname;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getOffice() {
        return office;
    }

    // 4.Вывести при помощи методов из пункта 3 ФИО и должность.
    public String surnameAndOffice() {
        return "Surname: " + getSurname() + "; Office: " + getOffice();
    }

    // 6.* Создать метод, повышающий зарплату всем сотрудникам старше 45 лет на 5000.

    public void setSalary(int salary) {
        if (getAge() > 45){
            this.salary = salary + getSalary();
        } else this.salary = salary;

    }

    public int getUid() {
        return uid;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void info(){
        System.out.println("Surname: " + surname + " Salary: " + salary + " Age: " + age + " Office: " + office);
    }
}
