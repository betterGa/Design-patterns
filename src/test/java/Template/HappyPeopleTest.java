package TemplateMethod;

import org.junit.Test;


import static org.junit.Assert.*;

public class HappyPeopleTest {
HappyPeople passengerByAir=new PassengerByAir();
HappyPeople passengerByCoach=new PassengerByCoach();
HappyPeople passengerByTrain=new PassengerByTrain();

    @Test
    public void celebrateSpringFestival() {
   System.out.println("Let's Go Home For A Grand Family Function...");
   System.out.println("Tom is going home:");
   passengerByAir.celebrateSpringFestival();
   System.out.println("Rose is going home:");
   passengerByCoach.celebrateSpringFestival();
   System.out.println("Catherine is going home:");
   passengerByTrain.celebrateSpringFestival();
    }

    @Test
    public void subscribeTicket() {
    }

    @Test
    public void travel() {
    }

    @Test
    public void celebrate() {
    }
}
