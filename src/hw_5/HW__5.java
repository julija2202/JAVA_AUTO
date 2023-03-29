package hw_5;

import com.sun.jdi.PathSearchingVirtualMachine;

public class HW__5 {
    public static void main(String[] args) {
        for (int j = 10; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        for (int j = 10; j > 0; j--) {
            for (int i = 10; i >= j; i--) {
                System.out.print("   ");
            }
            for (int i = 0; i < j; i++) {
                System.out.print(i + " ");
            }
            System.out.println(" ");
        }

       for (int j = 10; j >= 0; j--) {
            for (int i = 10; i > j; i--) {
                System.out.print("   ");
            }
          for (int i = j-1; i >= 0; i--) {
                System.out.print(i + " ");
            }
            for(int i = 1; i<j; i++){
             System.out.print(i + " ");
            }
            System.out.println("   ");
        }

        }
    }

