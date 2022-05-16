package task7_2;

public class Main {

    public static void main(String[] args) {

//        Employee employee = new Employee("Roman",20,'M',1000);
        Month[] months = {
                new Month("January",31,23)};


//        System.out.println(employee.getSalary(months));

        Manager manager = new Manager("I",20,'M',10,5);
        System.out.println(manager.getSalary(months));
    }
}
