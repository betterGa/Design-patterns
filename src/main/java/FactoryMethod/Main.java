package FactoryMethod;

public class Main {

    public static void main(String[] args) {
        PizzaStore ChicagoStore=new ChicagoPizzaStore();
       Pizza myPizza= ChicagoStore.orderPizza("Orange");
    }
}
