package hw_8_2;

public class Manager extends Employee {
    private  int NumberOfSubordinates;

    public Manager(String name, int baseSalary ,int numberOfSubordinates) {
        super(name, baseSalary);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {

        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {

        NumberOfSubordinates = numberOfSubordinates;
    }

    int getSalaryManager(){
        int salary = getBaseSalary() * getNumberOfSubordinates() /100 *3;
        if(salary ==0){
            return getBaseSalary();
        } else
               return salary;
    }
}
