package hw_8_2;

public class HW_8_2 {
    public static void main(String[] args) {
       /* Задача №1
        Необходимо создать класс Employee со следующими методами:
        getName - получить имя
                setName
        getBaseSalary - базовая ставка
                setBaseSalary*/


        /*Задача №2
        Необходимо создать класс Worker где метод getSalaryWorker  будет
        возвращать зарплату, базовую ставку.
        Необходимо создать класс Manager в который нужно добавить следующие
         методы:
        getNumberOfSubordinates - получить количество подчиненных
        setNumberOfSubordinates
        в классе, метод getSalaryManager будет возвращать значение по формуле -
        <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество
        подчиненных 0, то результат как у обычного рабочего.
        Необходимо создать класс Director, метод getSalaryDirector должен
        возвращать результат по формуле - <базовая ставка> *
         (<количество подчиненных> / 100 * 9). Если количество подчиненных 0,
         то результат как у обычного рабочего.
         */
        Manager manager = new Manager("Juli ",30, 40);
        System.out.println(manager.getSalaryManager());

        /*        Задача №3
        Необходимо создать класс со следующими методами:
        поиск сотрудника в массиве по его имени
        поиск сотрудника в массиве по вхождению указанной строки в его имени
        подсчет зарплатного бюджета для всех сотрудников в массиве
        поиск наименьшей зарплаты в массиве
        поиск наибольшей зарплаты в массиве
        поиск наименьшего количества подчиненных в массиве менеджеров
        поиск наибольшего количества подчиненных в массиве менеджеров
        поиск наибольшей надбавки (разнице между базовой ставкой и зарплатой)
        в массиве менеджеров
        поиск наименьшей надбавки (разнице между базовой ставкой и зарплатой)
        в массиве менеджеров*/

    }
}
