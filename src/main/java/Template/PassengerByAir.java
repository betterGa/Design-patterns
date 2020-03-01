package Template;
/*
public class PasserByAir {

    //Buy ticket...
        System.out.println("Buy ticket...");

//Traveling by air...
        System.out.println("Traveling by air");

    //Celebrating Chinese new year...
        System.out.println("Happy Chinese New Year!");
}
}
*/

public class PassengerByAir extends HappyPeople
{


    protected void travel() {
        //Traveling by air...
        System.out.println("Traveling by air...");
    }
}

//这样客户调用PassengerByAir对象的celebrateSpringFestival()方法就可以实现坐飞机回家了。