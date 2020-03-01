package FactoryMethod;

public abstract class PizzaStore
        {
            public Pizza orderPizza(String type)
        {
            Pizza pizza;
            pizza=createPizza(type);


            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();

            return pizza;
        }

        abstract public Pizza createPizza(String type);
}



