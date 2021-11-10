package DecoratorPattern;

public class Baubles extends TreeDecorator {

    public Baubles(ChristmasTree christmasTree){
        super(christmasTree);
    }

    @Override
    public String describe() {
        return super.describe() + addBaubles();
    }

    public String addBaubles(){
        return ", Baubles";
    }
}
