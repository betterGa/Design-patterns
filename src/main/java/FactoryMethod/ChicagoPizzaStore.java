package FactoryMethod;

import FactoryMethod.CherryPizza;
import FactoryMethod.OrangePizza;
import FactoryMethod.Pizza;
import FactoryMethod.PizzaStore;

public class ChicagoPizzaStore extends PizzaStore
        {

            public Pizza createPizza(String type)
            {
                if(type=="Cherry")
                {return new CherryPizza();
                }
                if(type=="Orange")
                    return new OrangePizza();
                else return null;
            }


        }
