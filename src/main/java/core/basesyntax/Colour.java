package core.basesyntax;

public enum Colour {
    RED("красный"),
    ORANGE("оранжевый"),
    YELLOW("желтый"),
    GREEN("зеленый"),
    BLUE("синий"),
    VIOLET("фиолетовый");

    private String translation;

    Colour(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}
