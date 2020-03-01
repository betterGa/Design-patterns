package FactoryMethod;

public class Pizza {

    String name;
    String dough;
    String sauce;

 void prepare()
 {System.out.println("Preparing"+name+"......");}

     void bake(){
     System.out.println("Bake for 25 minutes at 350");
     }

   void cut()
   {System.out.println("Cutting the pizza into diagonal slices");}

  void box()
  {System.out.println("Place pizza in official PizzaStore box");}

  public String getName()
  {return name;}
}
