package DecoratorPattern;

public abstract class TreeDecorator extends ChristmasTree {
    ChristmasTree christmasTree;

    public abstract String getDecorations();
}
