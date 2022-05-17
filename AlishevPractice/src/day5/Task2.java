package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2020, "rocket", "red");

        System.out.println("Год выпуска мотоцикла: " + motorbike1.getYear() + "\n" +
                "Модель: " + motorbike1.getModel() + "\n" +
                "Цвет: " + motorbike1.getColor());
    }
}


//   Создать класс Мотоцикл, с полями “Год выпуска”, “Цвет”,“Модель”.
//   Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//   использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//   слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
//   консоль.