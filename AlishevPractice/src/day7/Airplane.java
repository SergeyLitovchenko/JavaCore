package day7;

public class Airplane {
    private String producer;
    private int year;
    private int length;
    private int weight;
    private int fuel;

    public Airplane(String producer, int year, int length, int weight) {
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Producer: " + producer + "\n" +
                "Year: " + year + "\n" +
                "Length: " + length + "\n" +
                "Weight: " + weight + "\n" +
                "Fuel: " + fuel);
    }

    static public void compareAirplanes(Airplane comparable1, Airplane comparable2) {
        if (comparable1.length > comparable2.length)
            System.out.println(comparable1.producer + " bigger then " + comparable2.producer);
        else
            System.out.println(comparable2.producer + " bigger then " + comparable1.producer);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public String getProducer() {
        return producer;
    }

    public int getYear() {
        return year;
    }

    public int getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public int getFuel() {
        return fuel;
    }
}

