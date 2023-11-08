package bugman.abstractFactory;

import bugman.entity.Coffee;
import bugman.entity.Soda;
import bugman.entity.Tea;

public class AmericanDrinkFactory implements AbstractDrinkFactory{
    @Override
    public Coffee createCoffee() {
        return null;
    }

    @Override
    public Soda createSoda() {
        return null;
    }

    @Override
    public Tea createTea() {
        return null;
    }
}
