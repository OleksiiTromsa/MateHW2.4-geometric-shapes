package core.basesyntax;

public class Triangle extends Shape {
    private double leg1;
    private double leg2;
    private double hypotenuse;

    public Triangle(double leg1, double leg2, Colour colour) {
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.hypotenuse = Math.sqrt(leg1 * leg2);
        this.setColour(colour);
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getLeg1() {
        return leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println("Drawing triangle");
    }

    @Override
    public double getArea() {
        return leg1 * leg2 / 2;
    }

    @Override
    public String toString() {
        return String.format("Фигура: треугольник, площадь: %.1f кв. ед., "
                        + "гипотенуза: %.1f ед., цвет: %s",
                getArea(), getHypotenuse(), getColour().getValue());
    }
}
