package hw_8;

public class Employee {
    private static  String name;
    private static int age;
    private static String people;
    private static int salary_day = 50;
    int salary;


    int getSalary(int days){
        salary = salary_day * days;
        return salary;
    }

}
