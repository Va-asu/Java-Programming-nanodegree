package Designpattern.Adapterdesign;

public class Samsung {
    private charger c;

    public charger getC() {
        return c;
    }

    public void setC(charger c) {
        this.c = c;
    }

    public void isCharging(String status)
    {
        c.charge(status);
    }
}
