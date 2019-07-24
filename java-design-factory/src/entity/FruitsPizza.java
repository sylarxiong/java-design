package entity;

import factory.PizzaRawMaterialsFactory;

public class FruitsPizza extends Pizza {
    private PizzaRawMaterialsFactory pizzaRawMaterialsFactory;
    public FruitsPizza(PizzaRawMaterialsFactory pizzaRawMaterialsFactory){
        super.setName("FruitsPizza");
        this.pizzaRawMaterialsFactory = pizzaRawMaterialsFactory;
    }

    @Override
    public void prepare() {
        System.out.println("preparing FruitsPizza");
        dough = pizzaRawMaterialsFactory.createDough();
        sauce = pizzaRawMaterialsFactory.createSauce();
        System.out.println(dough.getName());
        System.out.println(sauce.getName());
    }
}
