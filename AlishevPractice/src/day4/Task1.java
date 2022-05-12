package day4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        input.close();

        int[] numbers = new int[size];
        int numbersBigger8 = 0;
        int numbers1 = 0;
        int numbersEven = 0;
        int numbersUneven = 0;
        int sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = (int) Math.ceil(Math.random() * 10);
        }

        System.out.println("Введено число " + size + ". Сгенерирован следующий массив:");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

            sum +=numbers[i];

            if (numbers[i] > 8) {
                numbersBigger8++;
            }
            if (numbers[i] == 1) {
                numbers1++;
            }
            if (numbers[i] % 2 == 0) {
                numbersEven++;
            } else {
                numbersUneven++;
            }
        }
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Информация о массиве:");
        System.out.println("Длина массива: " + size);
        System.out.println("Количестве чисел больше 8: " + numbersBigger8);
        System.out.println("Количестве чисел равных 1: " + numbers1);
        System.out.println("Количестве четных чисел: " + numbersEven);
        System.out.println("Количестве нечетных чисел: " + numbersUneven);
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
