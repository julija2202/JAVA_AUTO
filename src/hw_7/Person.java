package hw_7;

public class Person {
    String name = "Dima ";
    String name2 = "Juli ";
    int age = 29;
    int age2 = 36;
    String people = "m ";
    String people2 = "w ";
    String getName(String nam) {
        if (nam == name) {
            return " Mr "  + name + age + people;
        } else
            return "Mrs " + name2 + age2 + people2;
        }

}
