package day9.task2;

public class Triangle extends Figure {
    private double a, b, c;

    public Triangle(double a, double b, double c, String color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double halfPerimeter = perimeter() / 2;
        return  Math.sqrt(halfPerimeter * (halfPerimeter - a) * (halfPerimeter - b) * (halfPerimeter - c));
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
