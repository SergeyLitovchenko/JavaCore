package day6;

class Car {
    private int year;
    private String model;
    private String color;

    public Car (int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }
    public void info() {
        System.out.println("This is car");
    }
    public int yearDifference(int inputYear){
        return Math.abs(inputYear - year);
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