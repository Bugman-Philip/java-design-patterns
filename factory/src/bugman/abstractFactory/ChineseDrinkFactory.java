package bugman.abstractFactory;

import bugman.entity.Coffee;
import bugman.entity.Soda;
import bugman.entity.Tea;

public class ChineseDrinkFactory implements AbstractDrinkFactory{
    @Override
    public Tea createTea() {
        return null;
    }

    @Override
    public Soda createSoda() {
        return null;
    }

    @Override
    public Coffee createCoffee() {
        return null;
    }
}
