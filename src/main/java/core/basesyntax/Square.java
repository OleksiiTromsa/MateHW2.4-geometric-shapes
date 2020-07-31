package core.basesyntax;

public class Square extends Shape {
    private double side;

    public Square(double side, Colour colour) {
        this.side = side;
        this.setColour(colour);
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square");
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return String.format("Фигура: квадрат, площадь: %.1f кв. ед., сторона: %.1f ед., цвет: %s",
                getArea(), getSide(), getColour().getValue());
    }
}
