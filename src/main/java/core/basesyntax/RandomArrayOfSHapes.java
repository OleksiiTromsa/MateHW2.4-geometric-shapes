package core.basesyntax;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomArrayOfSHapes {
    private static final int MAX_SIZE = 10;
    private static final int MAX_SHAPE_ID = 4;
    private static final int MAX_COLOUR_ID = 6;

    public static void main(String[] args) {
        List<Shape> listOfShapes = createRandomListOfShapes();

        for (Shape shape : listOfShapes) {
            System.out.println(shape.toString());
        }
    }

    private static List<Shape> createRandomListOfShapes() {
        Random random = new Random();

        List<Shape> listOfShapes = new ArrayList<Shape>();

        int numberOfShapes = random.nextInt(MAX_SIZE) + 1;

        for (int i = 0; i < numberOfShapes; i++) {
            int typeOfShape = random.nextInt(MAX_SHAPE_ID) + 1;

            switch (typeOfShape) {
                case 1:
                    listOfShapes.add(new Triangle(Math.random() * MAX_SIZE,
                            Math.random() * MAX_SIZE, getRandomColour()));
                    break;
                case 2:
                    listOfShapes.add(new Square(Math.random() * MAX_SIZE, getRandomColour()));
                    break;
                case 3:
                    listOfShapes.add(new Circle(Math.random() * MAX_SIZE, getRandomColour()));
                    break;
                case 4:
                    listOfShapes.add(new Trapezoid(Math.random() * MAX_SIZE,
                            Math.random() * MAX_SIZE,
                            Math.random() * MAX_SIZE, getRandomColour()));
                    break;
                default:
                    break;
            }
        }

        return listOfShapes;
    }

    private static Colour getRandomColour() {
        int colour = new Random().nextInt(MAX_COLOUR_ID) + 1;

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
