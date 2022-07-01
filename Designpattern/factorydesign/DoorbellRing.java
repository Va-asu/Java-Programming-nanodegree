package Designpattern.factorydesign;

public class DoorbellRing implements  Ring{
    @Override
    public void showRing() {
        System.out.println("Doorbell is ringing....");
    }
}
