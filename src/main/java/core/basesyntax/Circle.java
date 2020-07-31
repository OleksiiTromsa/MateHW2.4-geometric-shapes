package core.basesyntax;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.setColour(colour);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing circle");
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Фигура: круг, площадь: %.1f кв. ед., радиус: %.1f ед., цвет: %s",
                getArea(), getRadius(), getColour().getValue());
    }
}
