package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car(1995, "sedan", "white");
        Motorbike motorbike1 = new Motorbike(2020, "rocket", "red");

        car1.info();
        motorbike1.info();

        System.out.println(car1.yearDifference(2022));
        System.out.println(motorbike1.yearDifference(2022));
    }
}
//    Для этого задания скопируйте классы Автомобиль и Мотоцикл из предыдущего дня
//    в пакет текущего дня.
//    В классах Автомобиль и Мотоцикл реализовать два метода:
//    info() - выводит в консоль строку “Это автомобиль” (или “Это мотоцикл”),
//    yearDifference() - принимает на вход число (год), и возвращает разницу между
//    переданным годом и годом выпуска транспортного средства