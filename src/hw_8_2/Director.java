package hw_8_2;

public class Director extends BaseManager{
    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    int getSalaryDirector(){
        int salary = getBaseSalary() * getNumberOfSubordinates() /100 *9;
        if(salary ==0){
            return getBaseSalary();
        } else
            return salary;
    }
}
