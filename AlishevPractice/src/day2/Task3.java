package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        in.close();

        int i = a + 1;
        while (i < b) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
//    Реализовать программу №2, используя цикл while.