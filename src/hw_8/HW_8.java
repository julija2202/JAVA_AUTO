package hw_8;

public class HW_8 {
    /*Задача №1
    Необходимо создать класс Employee с полями: имя, возраст, пол и ЗП в день.
     Все поля сделать приватными и для каждого поля добавить методы set и get.
      Класс должен иметь метод - getSalary(int days), метод возвращает зарплату
       за количество дней которые были переданы в качестве аргумента.
     */
    public static void main(String[] args) {
        Employee dima = new Employee("dima ", 29, "man", 50);
        System.out.println(dima.getName() + dima.getSalary(30));



    /*Задача №2
    Необходимо создать класс Manager с полями: имя, возраст, пол, ЗП в день и
     количество подчиненных. Все поля сделать приватными и для каждого поля
     добавить методы set и get. Класс должен иметь метод - getSalary(int days),
      метод возвращает зарплату за количество дней которые были переданы
       в качестве аргумента.
    К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.*/
        Manager juli = new Manager("juli ", 36, "woman", 30, 60);
        System.out.println(juli.getName() + juli.getSalary(17));
    }
}