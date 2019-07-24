package factory;

import entity.Dough;
import entity.Sauce;

public interface PizzaRawMaterialsFactory {
     Sauce createSauce();
     Dough createDough();
}
