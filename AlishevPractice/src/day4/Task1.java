package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        int arrayLenght = input.nextInt();
        input.close();

        int counter8 = 0;
        int counter1 = 0;
        int counterEven = 0;
        int counterOdd = 0;
        int sum = 0;

        Random random = new Random();
        int[] array = new int[arrayLenght];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }

        System.out.println("Введено число " + arrayLenght + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sum +=array[i];

            if (array[i] > 8)
                counter8++;
            if (array[i] == 1)
                counter1++;
            if (array[i] % 2 == 0)
                counterEven++;
             else
                counterOdd++;
        }
        System.out.println(" ");
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количестве чисел больше 8: " + counter8);
        System.out.println("Количестве чисел равных 1: " + counter1);
        System.out.println("Количестве четных чисел: " + counterEven);
        System.out.println("Количестве нечетных чисел: " + counterOdd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}

//    С клавиатуры вводится число n - размер массива. Необходимо создать массив
//    указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
//    содержимое массива в консоль, а также вывести в консоль информацию о:
//    а) Длине массива
//    б) Количестве чисел больше 8
//    в) Количестве чисел равных 1
//    г) Количестве четных чисел
//    д) Количестве нечетных чисел
//    е) Сумме всех элементов массива
//    Пример:Введено число 10. Сгенерирован следующий массив:
//    [4, 8, 4, 9, 5, 2, 2, 3, 3, 6]
//    Информация о массиве:
//    Длина массива: 10
//    Количество чисел больше 8: 1
//    Количество чисел равных 1: 0
//    Количество четных чисел: 6
//    Количество нечетных чисел: 4
//    Сумма всех элементов массива: 46
