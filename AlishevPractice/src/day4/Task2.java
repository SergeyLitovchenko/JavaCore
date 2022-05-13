package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = array[0];
        int min = array[0];
        int counterEnd0 = 0;
        int sumEnd0 = 0;

        for (int element : array) {
            if (element > max)
                max = element;
            if (element < min)
                min = element;
            if (element % 10 == 0) {
                counterEnd0++;
                sumEnd0 +=element;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(max + " - наибольший элемент массива");
        System.out.println(min + " - наименьший элемент массива");
        System.out.println(counterEnd0 + " - количество элементов массива, оканчивающихся на 0");
        System.out.println(sumEnd0 + " - сумма элементов массива, оканчивающихся на 0");
    }
}
//    Создать новый массив размера 100 и заполнить его случайными числами из
//    диапазона от 0 до 10000.
//    Затем, используя циклы for each вывести:
//    - наибольший элемент массива
//    - наименьший элемент массива
//    - количество элементов массива, оканчивающихся на 0
//    - сумму элементов массива, оканчивающихся на 0
//
//    Использовать сортировку запрещено.