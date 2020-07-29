package core.basesyntax;

public class Triangle extends Shape {
    private final double leg1;
    private final double leg2;

    public Triangle(double leg1, double leg2, Colour colour) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.setColour(colour);
    }

    public void draw() {
        System.out.println("Drawing triangle");
    }

    public double getArea() {
        return leg1 * leg2 / 2;
    }

    public double getHypotenuse() {
        return Math.sqrt(leg1 * leg2);
    }

    @Override
    public String toString() {
        return String.format("Фигура: треугольник, площадь: %.1f кв. ед., "
                        + "гипотенуза: %.1f ед., цвет: %s",
                getArea(), getHypotenuse(), getColour().getTranslation());
    }
}
