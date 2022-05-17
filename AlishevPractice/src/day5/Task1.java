package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(2022);
        car1.setModel("Avendator");
        car1.setColor("Yellow");

        System.out.println("Год выпуска автомобиля: " + car1.getYear() + "\n" +
                "Модель: " + car1.getModel() + "\n" +
                "Цвет: " + car1.getColor());
    }
}
//    Создать класс Автомобиль, с полями “Год выпуска”, “Цвет”, “Модель”.
//    Создать get и set методы для каждого поля. Создать экземпляр класса Автомобиль,
//    задать сеттером каждое поле, вывести в консоль значение каждого поля геттером.
//    Созданный вами класс должен отвечать принципам инкапсуляции.
