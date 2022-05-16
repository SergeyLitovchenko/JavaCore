package day5;

public class Task2 {
    public static void main(String[] args) {
        Motorbike motorbike1 = new Motorbike(2020,"red","rocket");

        System.out.println("Год выпуска автомобиля: " + motorbike1.getYear());
        System.out.println("Цвет: " + motorbike1.getColor());
        System.out.println("Модель: " + motorbike1.getModel());
    }
}

class Motorbike {
    private int year;
    private String color;
    private String model;

    public Motorbike (int year, String color, String model) {
        this.year = year;
        this.color = color;
        this.model = model;
    }
    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}

//   Создать класс Мотоцикл, с полями “Год выпуска”, “Цвет”,“Модель”.
//   Создать экземпляр класса Мотоцикл, с помощью конструктора (сеттеры не
//   использовать). Придерживаться принципов инкапсуляции и использовать ключевое
//   слово this. Геттером получить год выпуска, цвет, модель, вывести значения в
//   консоль.