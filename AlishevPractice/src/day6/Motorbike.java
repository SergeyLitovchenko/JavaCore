package day6;

class Motorbike {
    private int year;
    private String model;
    private String color;

    public Motorbike(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }
    public void info() {
        System.out.println("This is motorbike");
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
