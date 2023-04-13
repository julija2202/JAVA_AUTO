package hw_8_2;

public class FindPerson extends Manager {
    public FindPerson(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getByName(String name, Employee[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (name.equals(arr[i].getName())) {
                return i;
            }

        }

    return -1;
    }


}
