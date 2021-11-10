package DecoratorPattern;

public class FairyLights extends TreeDecorator {

    public FairyLights(ChristmasTree christmasTree){
        super(christmasTree);
    }

    @Override
    public String describe() {
        return super.describe() + addFairyLights();
    }

    public String addFairyLights(){
        return ", FairyLights";
    }

}

