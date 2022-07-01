package Designpattern.Adapterdesign;

public class Adaper implements charger{
    @Override
    public void charge(String str) {
        new ShowCharge().showCharge(str);
    }
}
