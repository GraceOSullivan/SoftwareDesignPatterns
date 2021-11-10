package DecoratorPattern;

public class Tinsel extends TreeDecorator {

    public Tinsel(ChristmasTree christmasTree){
        super(christmasTree);
    }

    @Override
    public String describe() {
        return super.describe() + addTinsel();
    }

    public String addTinsel(){
        return ", Tinsel";
    }
}