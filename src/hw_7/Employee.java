package hw_7;

public class Employee {
        String name = "Dima ";
        String name2 = "Juli ";
        int age = 29;
        int age2 = 36;
        String people = "m ";
        String people2 = "w ";
        int salary  = 800;
        int salary2 = 150;
        String isSameName(String nam) {
            if (nam == name) {
                return " Mr "  + name + age + people;
            } else
                return "Mrs " + name2 + age2 + people2;
        }
}
