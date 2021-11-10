package DecoratorPattern;

public abstract class TreeDecorator extends ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String describe() {
        return christmasTree.describe();
    }
}
