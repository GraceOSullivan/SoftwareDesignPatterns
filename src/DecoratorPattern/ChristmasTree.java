package DecoratorPattern;

public abstract class ChristmasTree {
    String decorations = "Undecorated";

    public String getDecorations() {
        return decorations;
    }

    public abstract String getType();
}
