package core.basesyntax;

public class Trapezoid extends Shape {
    private final double side1;
    private final double side2;
    private final double height;

    public Trapezoid(double side1, double side2, double height, Colour colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.setColour(colour);
    }

    public void draw() {
        System.out.println("Drawing trapezoid");
    }

    public double getArea() {
        return (side1 + side2) * height / 2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return String.format("Фигура: трапеция, площадь: %.1f кв. ед., высота: %.1f ед., цвет: %s",
                getArea(), getHeight(), getColour().getTranslation());
    }
}
