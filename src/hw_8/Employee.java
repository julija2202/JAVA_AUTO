package hw_8;

public class Employee {
    private  String name;
    private int age;
    private String people;
    private  int salary_day;

    public Employee(String name, int age, String people, int salary_day) {
        this.name = name;
        this.age = age;
        this.people = people;
        this.salary_day = salary_day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPeople() {
        return people;
    }

    public void setPeople(String people) {
        this.people = people;
    }

    public int getSalary_day() {
        return salary_day;
    }

    public void setSalary_day(int salary_day) {
        this.salary_day = salary_day;
    }

    int getSalary(int days){
        return  getSalary_day() * days;
    }

}
