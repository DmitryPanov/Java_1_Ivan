package Java1_Ivan_Lesson4.HW;

public class Main {
    public static void main(String[] args) {
        int sumSalary = 0;
        int sumAge = 0;
        int countEmployee = 0;
        //     * 5.Создать массив из 5 сотрудников. С помощью цикла вывести информацию только
        //     *   о сотрудниках старше 40 лет;

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov", 44000, 35, "Office-manager");
        employees[1] = new Employee("Petrov", 80000, 48, "Administrator");
        employees[2] = new Employee("Smirnov", 55000, 35, "Product-manager");
        employees[3] = new Employee("Sidorov", 100000, 50, "Director");
        employees[4] = new Employee("Andreev", 25000, 20, "Kassir");

        Employee employee = new Employee();
        employee.info();
        employee.setAge(25);
        employee.setSurname("Ali");
        employee.setOffice("Coach");
        employee.setSalary(10000);
        employee.info();


        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40) {
                System.out.println(employees[i].surnameAndOffice());
                sumSalary += employees[i].getSalary();
                sumAge += employees[i].getAge();
                countEmployee++;
            }
        }
        //7.* Подсчитать средние арифметические зарплаты и возраста сотрудников из п.5
        System.out.println("Avg Salary: " + sumSalary * 1.0f / countEmployee + "; Avg Age: " + sumAge * 1.0f / countEmployee);


        for (int i = 0; i < employees.length; i++) {
            employees[i].setSalary(5000);
            System.out.println(employees[i].getSalary());
            System.out.println(employees[i].getUid());
        }

    }
}
