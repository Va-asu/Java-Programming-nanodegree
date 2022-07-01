package Designpattern.Adapterdesign;

public class Main {
    public static void main(String[] args) {
        Samsung s1=new Samsung();
        //s1.setC();  here s1 requires the reference of the charger but charger is interface
        charger inst=new Adaper();
        s1.setC(inst);
        s1.isCharging("90%");

    }
}
