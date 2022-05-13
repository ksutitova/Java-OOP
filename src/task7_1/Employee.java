package task7_1;

/**Задача №1
        Необходимо создать класс Employee со следующими методами:
        getBaseSalary - получить базовую ставку
        set Base Salary
        getName - получить имя
        setName
        getSalary - получить зарплату
*/

public class Employee {

    private double baseSalary;
    private String name;
    private double salary;

    public Employee(double baseSalary, String name, double salary) {
        this.baseSalary = baseSalary;
        this.name = name;
        this.salary = salary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}