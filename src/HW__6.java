public class HW__6 {
    public static int number =1;
    public static void printNumber(){
        System.out.println();
        System.out.print(" Task №" +
                number++ + "   ----       ");
    }
    public static void main(String[] args) {
        /*Задача №1
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести сумму всех значений массива.*/
        printNumber();
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int result = 0;
        for( int i = 0; i<array.length; i++){
            result+= array[i];
        }
        System.out.println(result);

       /* Задача №2
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести максимальное значение массива.*/
        printNumber();
        int max = array[0];
        for(int i = 0; i<array.length; i++){
            if(max<array[i]){
                max = array[i];
            }
        }
        System.out.println(max);

        /*Задача №3
        Дан массив:
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        необходимо вывести минимальное значение массива.*/
        printNumber();
        int min = array[0];
        for(int i=0; i<array.length; i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println(min);


        /*Задача №4
        Дан массив:
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        необходимо вывести среднее арифметическое всех значений массива.*/
        printNumber();
        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int mid = 0;
        for( int i = 0; i<array2.length; i++){
            mid+= array2[i];
        }
        int count= 0;
        for (int i = 0; i< array2.length; i++){
            count++;
        }
        System.out.println(mid/count);


        /*Задача №5
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести сумму элементов массива.*/
        printNumber();
        int[][] array3 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int sum= 0;
        for(int i = 0; i <array3.length; i++){
            for(int j = 0; j< array3[i].length; j++){
                sum+= array3[i][j];
            }
        }
        System.out.println( sum);


        /*Задача №6
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести максимальное значение массива.*/
        printNumber();
        int max2= array3[0][0];
        for(int i = 0; i <array3.length; i++){
            for(int j = 0; j< array3[i].length; j++){
                if(max2<array3[i][j]){
                    max2 = array3[i][j];
                }
            }
        }
        System.out.println( max2);

        /*Задача №7
        Дан массив:
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        необходимо вывести количество элементов в массиве.*/
        printNumber();
        int count2= 0;
        for(int i = 0; i <array3.length; i++){
            for(int j = 0; j< array3[i].length; j++){
                    count2 ++;
            }
        }
        System.out.println( count2);

    }
}
