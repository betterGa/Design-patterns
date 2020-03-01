package Template;

//坐长途汽车回家过年

/*
public class PassengerByCoach {
    public void celebrateSpringFestival()
    {
//Buy ticket...
        System.out.println("Buy ticket...");

//Traveling by coach...
        System.out.println("Traveling by coach");

        //Celebrating Chinese new year...
        System.out.println("Happy Chinese New Year!");
    }
}
*/

public class PassengerByCoach extends HappyPeople
{
    protected void travel() {
        System.out.println("Traveling by coach...");
    }
}