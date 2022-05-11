package day2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        in.close();
        double y = 0;

        if (x >= 5) {
            y = (Math.pow(x, 2) - 10) / (x + 7);
        } else if (x > -3) {
            y = (x + 3) * (Math.pow(x, 2) - 2);
        } else {
            y = 420;
        }
        System.out.println(y);
    }
}
// Реализовать программу, которая принимает на вход через консоль с помощью класса
// Scanner, число x. Для этого числа, по формуле квадратного уравнения, необходимо вычислить
// значение y.


