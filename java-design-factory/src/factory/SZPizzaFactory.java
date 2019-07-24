package factory;

import entity.Dough;
import entity.MarinaraSauce;
import entity.Sauce;
import entity.ThinCrustDough;

public class SZPizzaFactory implements PizzaRawMaterialsFactory {
    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }
}
