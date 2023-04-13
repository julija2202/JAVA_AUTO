package hw_8_2;

public class Manager extends BaseManager {
    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    int getSalaryManager(){
        int salary = getBaseSalary() * getNumberOfSubordinates() /100 *3;
        if(salary ==0){
            return getBaseSalary();
        } else
               return salary;
    }
}
