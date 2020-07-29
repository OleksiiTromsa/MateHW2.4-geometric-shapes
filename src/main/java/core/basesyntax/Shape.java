package core.basesyntax;

public abstract class Shape {
    private Colour colour;

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public abstract void draw();

    public abstract double getArea();

}
