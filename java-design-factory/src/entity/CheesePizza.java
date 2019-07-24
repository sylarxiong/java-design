package entity;

import factory.PizzaRawMaterialsFactory;

public class CheesePizza extends Pizza {
    private PizzaRawMaterialsFactory pizzaRawMaterialsFactory;
    public CheesePizza(PizzaRawMaterialsFactory pizzaRawMaterialsFactory){
        super.setName("CheesePizza");
        this.pizzaRawMaterialsFactory = pizzaRawMaterialsFactory;
    }
    @Override
    public void prepare() {
        System.out.println("preparing CheesePizza");
        dough = pizzaRawMaterialsFactory.createDough();
        sauce = pizzaRawMaterialsFactory.createSauce();
        System.out.println(dough.getName());
        System.out.println(sauce.getName());
    }
}
