package hw_8_2;

public class BaseManager extends Employee{
    private  int NumberOfSubordinates;

    public BaseManager(String name, int baseSalary ,int numberOfSubordinates) {
        super(name, baseSalary);
        NumberOfSubordinates = numberOfSubordinates;
    }

    public int getNumberOfSubordinates() {

        return NumberOfSubordinates;
    }

    public void setNumberOfSubordinates(int numberOfSubordinates) {

        NumberOfSubordinates = numberOfSubordinates;
    }
}
