package core.basesyntax;

public class Circle extends Shape {
    private final double radius;

    public Circle(double radius, Colour colour) {
        this.radius = radius;
        this.setColour(colour);
    }

    public void draw() {
        System.out.println("Drawing circle");
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("Фигура: круг, площадь: %.1f кв. ед., радиус: %.1f ед., цвет: %s",
                getArea(), getRadius(), getColour().getTranslation());
    }
}
