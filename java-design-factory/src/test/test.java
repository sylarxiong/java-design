package test;

import entity.Pizza;
import factory.PizzaStore;
import factory.SZPizzaStore;

public class test {
    public static void main(String[] args){
        PizzaStore szPizzaStore = new SZPizzaStore();

        Pizza pizza = szPizzaStore.orderPizza("cheese");

        System.out.println(pizza.getName());
    }
}
