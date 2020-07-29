package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayOfSHapes {
    public static void main(String[] args) {
        Random random = new Random();

        List<Shape> listOfShapes = new ArrayList<Shape>();
        int numberOfShapes = random.nextInt(10) + 3;

        for (int i = 0; i < numberOfShapes; i++) {
            int typeOfShape = random.nextInt(4) + 1;

            switch (typeOfShape) {
                case 1:
                    listOfShapes.add(new Triangle(Math.random() * 10,
                            Math.random() * 10, getRandomColour()));
                    break;
                case 2:
                    listOfShapes.add(new Square(Math.random() * 10, getRandomColour()));
                    break;
                case 3:
                    listOfShapes.add(new Circle(Math.random() * 10, getRandomColour()));
                    break;
                case 4:
                    listOfShapes.add(new Trapezoid(Math.random() * 10, Math.random() * 10,
                            Math.random() * 10, getRandomColour()));
                    break;
                default:
                    break;
            }
        }

        for (Shape shape : listOfShapes) {
            System.out.println(shape.toString());
        }
    }

    public static Colour getRandomColour() {
        int colour = new Random().nextInt(6) + 1;

        switch (colour) {
            case 1:
                return Colour.RED;
            case 2:
                return Colour.ORANGE;
            case 3:
                return Colour.YELLOW;
            case 4:
                return Colour.GREEN;
            case 5:
                return Colour.BLUE;
            case 6:
                return Colour.VIOLET;
            default:
                return Colour.RED;
        }
    }
}
