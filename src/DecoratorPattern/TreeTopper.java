package DecoratorPattern;

public class TreeTopper extends TreeDecorator {

    public TreeTopper(ChristmasTree christmasTree){
        super(christmasTree);
    }

    @Override
    public String describe() {
        return super.describe() + addTreeTopper();
    }

    public String addTreeTopper(){
        return ", Tree Topper";
    }
}
