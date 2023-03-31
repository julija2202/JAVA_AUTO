package hw_7;

public class Employee {
        String name = "Dima ";
        int age = 29;
        String people = "m ";
        int salary  = 800;
        String isSameName(String nam) {
            if (nam == name) {
                return name +  salary;
            } else
            return null;
        }

}
