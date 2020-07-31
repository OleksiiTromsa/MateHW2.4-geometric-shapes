package core.basesyntax;

public enum Colour {
    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    BLUE("синий"),
    VIOLET("фиолетовый");

    private String value;

    Colour(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
