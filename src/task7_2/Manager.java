package task7_2;

public class Manager extends Employee{
    /**
     * Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и количество подчиненных.
     * Все поля сделать приватными и для каждого поля добавить методы set и get.
     * Класс должен иметь метод - getSalary(Month[] monthArray), метод возвращает зарплату за те месяцы которые
     * были переданы в качестве аргумента.
     * К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.
     */

    private int numberOfSubordinates;

    public Manager(String name, int age, char gender, double salary, int numberOfSubordinates) {
        super(name, age, gender, salary);
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {
        return numberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {
        this.numberOfSubordinates = numberOfSubordinates;
    }

    public double getSalary(Month[] monthArray){
        double result = 0;
        for (int i = 0; i < monthArray.length; i++) {
            result += getSalary() * monthArray[i].getWorkDays();
        }
        return result + result*numberOfSubordinates/100;

    }


}
