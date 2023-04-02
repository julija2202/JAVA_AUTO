package hw_7;

public class HW__7 {
    public static void main(String[] args) {
        /*Задача №1
        Необходимо создать класс hw_7.Person с полями: имя, возраст, пол. Класс
        должен иметь метод - getName, метод возвращает имя с префиксом “Mr.
        ” если пол указан как мужской и префикс “Mrs. ” если женский.*/
        Person person = new Person();
        String people = person.getName("Juli ");
        System.out.println(people);


        /*Задача №2
        Необходимо создать класс hw_7.Employee с полями как у hw_7.Person (из
        предыдущего задания) и поле зарплата. Класс должен иметь метод
         isSameName(hw_7.Employee employee) который возвращает true, если
         у сотрудника у которого был вызван метод и сотрудника который был
          передан как параметр, одинаковое имя.
         */
        Employee employee = new Employee();
        String e = employee.isSameName("Dima ");
        String ee = employee.isSameName("Gim ");
        System.out.println(e);
        System.out.println(ee);


        /*Задача №3
        Необходимо создать класс Salary с единственным методом -
        getSum(hw_7.Employee[] employeeArray), метод должен возвращать сумму
        зарплат всех сотрудников из массива переданного в качестве аргумента
        вызова метода. */
        int employeeArray[] = {employee.salary, employee.salary2};
        Salary salary = new Salary();
        //salary.getSum(employeeArray[]);
    }
}
