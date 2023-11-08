package bugman.abstractFactory;

import bugman.entity.Coffee;
import bugman.entity.Soda;
import bugman.entity.Tea;

public interface AbstractDrinkFactory {
    Coffee createCoffee();

    Tea createTea();

    Soda createSoda();
}
