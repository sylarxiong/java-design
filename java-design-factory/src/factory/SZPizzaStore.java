package factory;

import entity.CheesePizza;
import entity.FruitsPizza;
import entity.Pizza;

public class SZPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        PizzaRawMaterialsFactory sz = new SZPizzaFactory();
        if(type.equals("cheese")){
            return new CheesePizza(sz);
        }else if(type.equals("fruits")){
            return new FruitsPizza(sz);
        }
        return null;
    }
}
