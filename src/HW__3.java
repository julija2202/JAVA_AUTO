public class HW__3 {
    static int number = 1;
    public static void printNum(){
        System.out.println("Number " + number++);
    }
    public static void main(String[] args) {
    /*    Задача №1
        Необходимо создать две целочисленные переменные (a, b), присвоить
        произвольные значения переменным на ваш выбор и вывести следующие
        строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a */
        printNum();
        int a = 22;
        int b = 37;
        if (a == b){
            System.out.println( "a == b");
        } else if (a<b){
            System.out.println("a<b");
        } else if(a>b){
            System.out.println("a>b");
        }

        /*Задача №2
        Необходимо создать две целочисленные переменные (a, b), присвоить
        произвольные значения переменным на ваш выбор и вывести следующие
        строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная*/

        printNum();
        if ((a + b)%2 ==0){
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }

        /*Задача №3
        Необходимо создать целочисленную переменную, присвоить произвольное
         значение переменной на ваш выбор и вывести следующие строки:
        больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущие условие
         ложное */

        printNum();
        int c = 99;
        if(c > 0){
            System.out.println(c + " - больше 10 ");
        } if (c < 100){
            System.out.println(c + " - меньше 100 ");
        } if(c/2> 20){
            System.out.println("результат деления на 2 больше 20");
        }

    }
}
