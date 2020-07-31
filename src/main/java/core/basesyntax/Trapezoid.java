package core.basesyntax;

public class Trapezoid extends Shape {
    private double side1;
    private double side2;
    private double height;

    public Trapezoid(double side1, double side2, double height, Colour colour) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
        this.setColour(colour);
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing trapezoid");
    }

    @Override
    public double getArea() {
        return (side1 + side2) * height / 2;
    }

    @Override
    public String toString() {
        return String.format("Фигура: трапеция, площадь: %.1f кв. ед., высота: %.1f ед., цвет: %s",
                getArea(), getHeight(), getColour().getValue());
    }
}
