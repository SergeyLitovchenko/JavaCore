package day5;

class Motorbike {
    private int year;
    private String model;
    private String color;

    public Motorbike (int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
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
