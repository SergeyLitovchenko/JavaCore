package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2022);
        car1.setColor("Yellow");
        car1.setModel("Avendator");

        System.out.println("Год выпуска автомобиля: " + car1.getYear());
        System.out.println("Цвет: " + car1.getColor());
        System.out.println("Модель: " + car1.getModel());
    }
}

class Car {
    private int year;
    private String color;
    private String model;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
//    Создать класс Автомобиль, с полями “Год выпуска”, “Цвет”, “Модель”.
//    Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//    задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//    Созданный вами класс должен отвечать принципам инкапсуляции.
